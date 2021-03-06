/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* list all the group IDs in an AuthorizationGroup
*/
@Generated("with GenerateAdminCommands")
class ListGroupIDsOfAuthorizationGroupCmd extends AdminCmd<Void> {
    ListGroupIDsOfAuthorizationGroupCmd() {
        super("listGroupIDsOfAuthorizationGroup")
    }

    /**
     * Authorization Group
     */
    def 'authorizationGroupName'(String value) {
        parameter("authorizationGroupName", value)
    }

}
