/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* list all the AuthorizationGroups that a given group has access to
*/
@Generated("with GenerateAdminCommands")
class ListAuditAuthorizationGroupsForGroupIDCmd extends AdminCmd<Void> {
    ListAuditAuthorizationGroupsForGroupIDCmd() {
        super("listAuditAuthorizationGroupsForGroupID")
    }

    /**
     * Group ID.
     */
    def 'groupid'(String value) {
        parameter("groupid", value)
    }

}
