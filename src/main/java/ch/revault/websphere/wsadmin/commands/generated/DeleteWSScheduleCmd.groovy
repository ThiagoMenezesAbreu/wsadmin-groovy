/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands.generated
import ch.revault.websphere.wsadmin.commands.AdminCmd
import javax.annotation.Generated
/**
* Delete an existing schedule.
*/
@Generated("with GenerateAdminCommands")
class DeleteWSScheduleCmd extends AdminCmd<Void> {
    DeleteWSScheduleCmd() {
        super("deleteWSSchedule")
    }

    /**
     * Specifies the schedule name.
     */
    def 'name'(String value) {
        parameter("name", value)
    }

}
