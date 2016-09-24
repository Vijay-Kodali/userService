package com.kodali.user.service.model;

/**
 * 
 * @author kodali
 *
 */
public class UserProfileResponse {
   
    private int status;
    private String statusMessage;
    private String error;
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public String getStatusMessage() {
        return statusMessage;
    }
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }
    public String getError() {
        return error;
    }
    public void setError(String error) {
        this.error = error;
    }
   
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(", status=");
        builder.append(status);
        builder.append(", statusMessage=");
        builder.append(statusMessage);
        builder.append(", error=");
        builder.append(error);
        builder.append("]");
        return builder.toString();
    }
    
    
}
