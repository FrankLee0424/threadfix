////////////////////////////////////////////////////////////////////////
//
//     Copyright (c) 2009-2015 Denim Group, Ltd.
//
//     The contents of this file are subject to the Mozilla Public License
//     Version 2.0 (the "License"); you may not use this file except in
//     compliance with the License. You may obtain a copy of the License at
//     http://www.mozilla.org/MPL/
//
//     Software distributed under the License is distributed on an "AS IS"
//     basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
//     License for the specific language governing rights and limitations
//     under the License.
//
//     The Original Code is ThreadFix.
//
//     The Initial Developer of the Original Code is Denim Group, Ltd.
//     Portions created by Denim Group, Ltd. are Copyright (C)
//     Denim Group, Ltd. All Rights Reserved.
//
//     Contributor(s): Denim Group, Ltd.
//
////////////////////////////////////////////////////////////////////////
package com.denimgroup.threadfix.importer.update.impl;

import com.denimgroup.threadfix.annotations.MappingsUpdater;

/**
 * This class adds the importer to the database so it is available to the other parts of ThreadFix.
 * We can leverage the existing method in ChannelVulnerabilityUpdater to do all the actual work; having this file in
 * the JAR and supplying the path in getFolder() is enough for ThreadFix to update correctly.
 */
@MappingsUpdater
public class SampleImporterUpdater extends WafsUpdater {

    /**
     * The result of this method is used to look in the resources folder of the JAR for candidate CSV files
     * @return folder name
     */
    @Override
    public String getFolder() {
        return "custom";
    }

}
