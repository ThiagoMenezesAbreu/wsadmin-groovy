/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Get the JNDI name that is bound to java:comp/DefaultJMSConnectionFactory.
*/
@Generated("with GenerateAdminCommands")
class GetDefaultJMSConnectionFactoryCmd extends AdminCmd<Void> {
    GetDefaultJMSConnectionFactoryCmd() {
        super("getDefaultJMSConnectionFactory")
    }

}
