/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Queries a certificate authority (CA) to see if a certificate is complete.
*/
@Generated("with GenerateAdminCommands")
class QueryCACertificateCmd extends AdminCmd<Void> {
    QueryCACertificateCmd() {
        super("queryCACertificate")
    }

    /**
     * Specifies the unique name to identify the keystore.
     */
    def 'keyStoreName'(String value) {
        parameter("keyStoreName", value)
    }

    /**
     * Specifies the scope of the keystore.
     */
    def 'keyStoreScope'(String value) {
        parameter("keyStoreScope", value)
    }

    /**
     * Specifies a unique name to identify a certificate.
     */
    def 'certificateAlias'(String value) {
        parameter("certificateAlias", value)
    }

}
