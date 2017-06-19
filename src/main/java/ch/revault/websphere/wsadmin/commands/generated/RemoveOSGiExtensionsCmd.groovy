/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Removes multiple extensions from the composition unit.
*/
@Generated("with GenerateAdminCommands")
class RemoveOSGiExtensionsCmd extends AdminCmd<Void> {
    RemoveOSGiExtensionsCmd() {
        super("removeOSGiExtensions")
    }

    /**
     * The name of the composition unit.
     */
    def 'cuName'(String value) {
        parameter("cuName", value)
    }

    /**
     * A list of extension identifiers specified as <extension symbolic name>;<extension version>
     */
    def 'extensions'(String value) {
        parameter("extensions", value)
    }

}
