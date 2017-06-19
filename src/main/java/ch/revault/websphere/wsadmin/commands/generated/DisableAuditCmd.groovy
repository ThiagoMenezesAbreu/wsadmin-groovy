/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Disables Security Auditing and resets the auditEnabled field in audit.xml.
*/
@Generated("with GenerateAdminCommands")
class DisableAuditCmd extends AdminCmd<Void> {
    DisableAuditCmd() {
        super("disableAudit")
    }

}
