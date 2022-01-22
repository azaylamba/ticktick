package com.relevel.ticktick.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Reminder {

    @Id
    private long reminder_id;
}
