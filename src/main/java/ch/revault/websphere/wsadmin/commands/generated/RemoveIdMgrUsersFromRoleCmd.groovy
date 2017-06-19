/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Removes the users from the specified virtual member manager role. If value for userId parameter is specified as "*" all users mapped for the role are removed.
*/
@Generated("with GenerateAdminCommands")
class RemoveIdMgrUsersFromRoleCmd extends AdminCmd<Void> {
    RemoveIdMgrUsersFromRoleCmd() {
        super("removeIdMgrUsersFromRole")
    }

    /**
     * Name of the role: IdMgrAdmin, IdMgrWriter, or IdMgrReader.
     */
    def 'roleName'(String value) {
        parameter("roleName", value)
    }

    /**
     * uid or UniqueName of user. If uid is provided it should correspond to a unique user.     
     */
    def 'userId'(String value) {
        parameter("userId", value)
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

}
