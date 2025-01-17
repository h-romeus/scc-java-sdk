#!/bin/bash

# This script will publish code coverage info for a build of the master branch
# or a tagged release.

printf ">>>>> Publishing code coverage info\n"

JACOCO_SOURCE_PATH=modules/common/src/main/java ./cc-test-reporter format-coverage modules/common/target/site/jacoco/jacoco.xml -d -o common.json -t jacoco
JACOCO_SOURCE_PATH=modules/configuration-governance/src/main/java ./cc-test-reporter format-coverage modules/configuration-governance/target/site/jacoco/jacoco.xml -d -o configuration-governance.json -t jacoco

./cc-test-reporter sum-coverage common.json configuration-governance.json -o coverage.json -d

./cc-test-reporter upload-coverage --input coverage.json
