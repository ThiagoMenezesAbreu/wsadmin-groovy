/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Get information about a Dynamic SSL configuration selection.
*/
@Generated("with GenerateAdminCommands")
class GetDynamicSSLConfigSelectionCmd extends AdminCmd<Void> {
    GetDynamicSSLConfigSelectionCmd() {
        super("getDynamicSSLConfigSelection")
    }

    /**
     * Specifies the name that uniquely identifies the dynamic SSL configuration selection.
     */
    def 'dynSSLConfigSelectionName'(String value) {
        parameter("dynSSLConfigSelectionName", value)
    }

    /**
     * Specifies the management scope.
     */
    def 'scopeName'(String value) {
        parameter("scopeName", value)
    }

}
