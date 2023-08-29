/*
 * (C) Copyright IBM Corp. 2023.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.ibm.cloud.security_and_compliance_center_api.v3.model;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.security_and_compliance_center_api.v3.model.ResourceSummaryItem;
import com.ibm.cloud.security_and_compliance_center_api.v3.model.Tags;
import com.ibm.cloud.security_and_compliance_center_api.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ResourceSummaryItem model.
 */
public class ResourceSummaryItemTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testResourceSummaryItem() throws Throwable {
    ResourceSummaryItem resourceSummaryItemModel = new ResourceSummaryItem();
    assertNull(resourceSummaryItemModel.getName());
    assertNull(resourceSummaryItemModel.getId());
    assertNull(resourceSummaryItemModel.getService());
    assertNull(resourceSummaryItemModel.getTags());
    assertNull(resourceSummaryItemModel.getAccount());
    assertNull(resourceSummaryItemModel.getStatus());
    assertNull(resourceSummaryItemModel.getTotalCount());
    assertNull(resourceSummaryItemModel.getPassCount());
    assertNull(resourceSummaryItemModel.getFailureCount());
    assertNull(resourceSummaryItemModel.getErrorCount());
    assertNull(resourceSummaryItemModel.getCompletedCount());
  }
}