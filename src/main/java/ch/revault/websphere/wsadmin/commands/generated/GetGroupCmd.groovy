/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Retrieves the attributes of a group.
*/
@Generated("with GenerateAdminCommands")
class GetGroupCmd extends AdminCmd<Void> {
    GetGroupCmd() {
        super("getGroup")
    }

    /**
     * The name that uniquely identifies an object of a virtual member manager entity.
     */
    def 'uniqueName'(String value) {
        parameter("uniqueName", value)
    }

    /**
     * Name used to uniquely identify the security domain.
     */
    def 'securityDomainName'(String value) {
        parameter("securityDomainName", value)
    }

    /**
     * The mode of clearing cache before the operation. Valid values are 'clearEntity' and 'clearAll'.
     */
    def 'clearCache'(String value) {
        parameter("clearCache", value)
    }

}
