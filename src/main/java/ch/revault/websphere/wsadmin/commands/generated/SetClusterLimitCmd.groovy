/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* null
*/
@Generated("with GenerateAdminCommands")
class SetClusterLimitCmd extends AdminCmd<Void> {
    SetClusterLimitCmd() {
        super("setClusterLimit")
    }

    /**
     * null
     */
    def 'numClusters'(Short value) {
        parameter("numClusters", value)
    }

}
