// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Drive.
 */
public class BaseDrive extends BaseItem implements IJsonBackedObject {


    /**
     * The Drive Type.
     * Describes the type of drive represented by this resource. OneDrive personal drives will return personal. OneDrive for Business will return business. SharePoint document libraries will return documentLibrary. Read-only.
     */
    @SerializedName("driveType")
    @Expose
    public String driveType;

    /**
     * The Owner.
     * Optional. The user account that owns the drive. Read-only.
     */
    @SerializedName("owner")
    @Expose
    public IdentitySet owner;

    /**
     * The Quota.
     * Optional. Information about the drive's storage space quota. Read-only.
     */
    @SerializedName("quota")
    @Expose
    public Quota quota;

    /**
     * The Share Point Ids.
     * 
     */
    @SerializedName("sharePointIds")
    @Expose
    public SharepointIds sharePointIds;

    /**
     * The System.
     * 
     */
    @SerializedName("system")
    @Expose
    public SystemFacet system;

    /**
     * The Items.
     * All items contained in the drive. Read-only. Nullable.
     */
    public transient DriveItemCollectionPage items;

    /**
     * The List.
     * 
     */
    @SerializedName("list")
    @Expose
    public List list;

    /**
     * The Root.
     * The root folder of the drive. Read-only.
     */
    @SerializedName("root")
    @Expose
    public DriveItem root;

    /**
     * The Special.
     * Collection of common folders available in OneDrive. Read-only. Nullable.
     */
    public transient DriveItemCollectionPage special;


    /**
     * The raw representation of this class
     */
    private transient JsonObject mRawObject;

    /**
     * The serializer
     */
    private transient ISerializer mSerializer;

    /**
     * Gets the raw representation of this class
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return mRawObject;
    }

    /**
     * Gets serializer
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return mSerializer;
    }

    /**
     * Sets the raw json object
     *
     * @param serializer The serializer
     * @param json The json object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        mSerializer = serializer;
        mRawObject = json;


        if (json.has("items")) {
            final BaseDriveItemCollectionResponse response = new BaseDriveItemCollectionResponse();
            if (json.has("items@odata.nextLink")) {
                response.nextLink = json.get("items@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("items").toString(), JsonObject[].class);
            final DriveItem[] array = new DriveItem[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DriveItem.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            items = new DriveItemCollectionPage(response, null);
        }

        if (json.has("special")) {
            final BaseDriveItemCollectionResponse response = new BaseDriveItemCollectionResponse();
            if (json.has("special@odata.nextLink")) {
                response.nextLink = json.get("special@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("special").toString(), JsonObject[].class);
            final DriveItem[] array = new DriveItem[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DriveItem.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            special = new DriveItemCollectionPage(response, null);
        }
    }
}
