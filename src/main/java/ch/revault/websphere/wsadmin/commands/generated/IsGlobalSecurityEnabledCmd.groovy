/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Returns the current administrative security setting of true or false.
*/
@Generated("with GenerateAdminCommands")
class IsGlobalSecurityEnabledCmd extends AdminCmd<Void> {
    IsGlobalSecurityEnabledCmd() {
        super("isGlobalSecurityEnabled")
    }

}
