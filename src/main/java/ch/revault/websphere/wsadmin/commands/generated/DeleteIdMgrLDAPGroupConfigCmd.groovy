/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Deletes the entire LDAP group configuration.
*/
@Generated("with GenerateAdminCommands")
class DeleteIdMgrLDAPGroupConfigCmd extends AdminCmd<Void> {
    DeleteIdMgrLDAPGroupConfigCmd() {
        super("deleteIdMgrLDAPGroupConfig")
    }

    /**
     * The unique identifier of the repository.
     */
    def 'id'(String value) {
        parameter("id", value)
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

}
