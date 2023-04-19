package com.goride.user.models.responsemodels;

import com.goride.user.models.datamodels.UserAddress;
import com.google.gson.annotations.SerializedName;

public class SaveAddressResponse {

    @SerializedName("success")
    private boolean success;

    @SerializedName("user_address")
    private UserAddress userAddress;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public UserAddress getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(UserAddress userAddress) {
        this.userAddress = userAddress;
    }

    @Override
    public String toString() {
        return "SaveAddressResponse{" + "success = '" + success + '\'' + ",user_address = '" + userAddress + '\'' + "}";
    }
}