/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* The listAssetsAttachedToPolicySet command lists the assets to which a specific policy set is attached.
*/
@Generated("with GenerateAdminCommands")
class ListAssetsAttachedToPolicySetCmd extends AdminCmd<Void> {
    ListAssetsAttachedToPolicySetCmd() {
        super("listAssetsAttachedToPolicySet")
    }

    /**
     * Specifies the policy set name. For a list of all policy set names, use the listPolicySets command. (String) 
     */
    def 'policySet'(String value) {
        parameter("policySet", value)
    }

    /**
     * Specifies the type of policy set attachments. The value for this parameter must be application, client, or system/trust. The default value is application. (String) 
     */
    def 'attachmentType'(String value) {
        parameter("attachmentType", value)
    }

}
