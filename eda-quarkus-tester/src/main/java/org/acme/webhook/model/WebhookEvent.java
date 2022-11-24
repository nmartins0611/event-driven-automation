package org.acme.webhook.model;

import org.acme.model.Event;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WebhookEvent extends Event{
    @JsonProperty("target_hosts")
    public String eventTargetHosts;

public WebhookEvent() {}
public WebhookEvent(String eventName, String eventMessage, String eventTargetHosts){
    this.eventMessage=eventMessage;
    this.eventName=eventName;
    this.eventTargetHosts=eventTargetHosts;
}

}
