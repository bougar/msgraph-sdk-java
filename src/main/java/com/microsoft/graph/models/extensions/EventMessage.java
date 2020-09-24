// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.DateTimeTimeZone;
import com.microsoft.graph.models.extensions.Location;
import com.microsoft.graph.models.generated.MeetingMessageType;
import com.microsoft.graph.models.extensions.PatternedRecurrence;
import com.microsoft.graph.models.generated.EventType;
import com.microsoft.graph.models.extensions.Event;
import com.microsoft.graph.models.extensions.Message;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Event Message.
 */
public class EventMessage extends Message implements IJsonBackedObject {


    /**
     * The End Date Time.
     * 
     */
    @SerializedName("endDateTime")
    @Expose
    public DateTimeTimeZone endDateTime;

    /**
     * The Is All Day.
     * 
     */
    @SerializedName("isAllDay")
    @Expose
    public Boolean isAllDay;

    /**
     * The Is Delegated.
     * True if this meeting request is accessible to a delegate, false otherwise. Default is false.
     */
    @SerializedName("isDelegated")
    @Expose
    public Boolean isDelegated;

    /**
     * The Is Out Of Date.
     * 
     */
    @SerializedName("isOutOfDate")
    @Expose
    public Boolean isOutOfDate;

    /**
     * The Location.
     * 
     */
    @SerializedName("location")
    @Expose
    public Location location;

    /**
     * The Meeting Message Type.
     * The type of event message: none, meetingRequest, meetingCancelled, meetingAccepted, meetingTenativelyAccepted, meetingDeclined.
     */
    @SerializedName("meetingMessageType")
    @Expose
    public MeetingMessageType meetingMessageType;

    /**
     * The Recurrence.
     * 
     */
    @SerializedName("recurrence")
    @Expose
    public PatternedRecurrence recurrence;

    /**
     * The Start Date Time.
     * 
     */
    @SerializedName("startDateTime")
    @Expose
    public DateTimeTimeZone startDateTime;

    /**
     * The Type.
     * 
     */
    @SerializedName("type")
    @Expose
    public EventType type;

    /**
     * The Event.
     * The event associated with the event message. The assumption for attendees or room resources is that the Calendar Attendant is set to automatically update the calendar with an event when meeting request event messages arrive. Navigation property.  Read-only.
     */
    @SerializedName("event")
    @Expose
    public Event event;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
