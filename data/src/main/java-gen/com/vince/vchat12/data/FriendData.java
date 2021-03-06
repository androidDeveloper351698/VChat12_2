package com.vince.vchat12.data;

import com.vince.vchat12.data.DaoSession;
import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "FRIEND_DATA".
 */
public class FriendData {

    private String objectId;
    private String remark;
    private String description;
    private Boolean isStar;
    private Boolean isBlack;
    private Boolean isShieldMyCircle;
    private Boolean isBlockHisCircle;
    private String attachmentLinksString;
    private java.util.Date updateTime;
    private String firstLetter;
    private String groupPointer;
    private String targetUserPointer;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient FriendDataDao myDao;

    private GroupData o2o_groupPointer;
    private String o2o_groupPointer__resolvedKey;

    private UserData o2o_targetUserPointer;
    private String o2o_targetUserPointer__resolvedKey;


    public FriendData() {
    }

    public FriendData(String objectId) {
        this.objectId = objectId;
    }

    public FriendData(String objectId, String remark, String description, Boolean isStar, Boolean isBlack, Boolean isShieldMyCircle, Boolean isBlockHisCircle, String attachmentLinksString, java.util.Date updateTime, String firstLetter, String groupPointer, String targetUserPointer) {
        this.objectId = objectId;
        this.remark = remark;
        this.description = description;
        this.isStar = isStar;
        this.isBlack = isBlack;
        this.isShieldMyCircle = isShieldMyCircle;
        this.isBlockHisCircle = isBlockHisCircle;
        this.attachmentLinksString = attachmentLinksString;
        this.updateTime = updateTime;
        this.firstLetter = firstLetter;
        this.groupPointer = groupPointer;
        this.targetUserPointer = targetUserPointer;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getFriendDataDao() : null;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIsStar() {
        return isStar;
    }

    public void setIsStar(Boolean isStar) {
        this.isStar = isStar;
    }

    public Boolean getIsBlack() {
        return isBlack;
    }

    public void setIsBlack(Boolean isBlack) {
        this.isBlack = isBlack;
    }

    public Boolean getIsShieldMyCircle() {
        return isShieldMyCircle;
    }

    public void setIsShieldMyCircle(Boolean isShieldMyCircle) {
        this.isShieldMyCircle = isShieldMyCircle;
    }

    public Boolean getIsBlockHisCircle() {
        return isBlockHisCircle;
    }

    public void setIsBlockHisCircle(Boolean isBlockHisCircle) {
        this.isBlockHisCircle = isBlockHisCircle;
    }

    public String getAttachmentLinksString() {
        return attachmentLinksString;
    }

    public void setAttachmentLinksString(String attachmentLinksString) {
        this.attachmentLinksString = attachmentLinksString;
    }

    public java.util.Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getFirstLetter() {
        return firstLetter;
    }

    public void setFirstLetter(String firstLetter) {
        this.firstLetter = firstLetter;
    }

    public String getGroupPointer() {
        return groupPointer;
    }

    public void setGroupPointer(String groupPointer) {
        this.groupPointer = groupPointer;
    }

    public String getTargetUserPointer() {
        return targetUserPointer;
    }

    public void setTargetUserPointer(String targetUserPointer) {
        this.targetUserPointer = targetUserPointer;
    }

    /** To-one relationship, resolved on first access. */
    public GroupData getO2o_groupPointer() {
        String __key = this.groupPointer;
        if (o2o_groupPointer__resolvedKey == null || o2o_groupPointer__resolvedKey != __key) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            GroupDataDao targetDao = daoSession.getGroupDataDao();
            GroupData o2o_groupPointerNew = targetDao.load(__key);
            synchronized (this) {
                o2o_groupPointer = o2o_groupPointerNew;
            	o2o_groupPointer__resolvedKey = __key;
            }
        }
        return o2o_groupPointer;
    }

    public void setO2o_groupPointer(GroupData o2o_groupPointer) {
        synchronized (this) {
            this.o2o_groupPointer = o2o_groupPointer;
            groupPointer = o2o_groupPointer == null ? null : o2o_groupPointer.getObjectId();
            o2o_groupPointer__resolvedKey = groupPointer;
        }
    }

    /** To-one relationship, resolved on first access. */
    public UserData getO2o_targetUserPointer() {
        String __key = this.targetUserPointer;
        if (o2o_targetUserPointer__resolvedKey == null || o2o_targetUserPointer__resolvedKey != __key) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            UserDataDao targetDao = daoSession.getUserDataDao();
            UserData o2o_targetUserPointerNew = targetDao.load(__key);
            synchronized (this) {
                o2o_targetUserPointer = o2o_targetUserPointerNew;
            	o2o_targetUserPointer__resolvedKey = __key;
            }
        }
        return o2o_targetUserPointer;
    }

    public void setO2o_targetUserPointer(UserData o2o_targetUserPointer) {
        synchronized (this) {
            this.o2o_targetUserPointer = o2o_targetUserPointer;
            targetUserPointer = o2o_targetUserPointer == null ? null : o2o_targetUserPointer.getObjectId();
            o2o_targetUserPointer__resolvedKey = targetUserPointer;
        }
    }

    /** Convenient call for {@link AbstractDao#delete(Object)}. Entity must attached to an entity context. */
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.delete(this);
    }

    /** Convenient call for {@link AbstractDao#update(Object)}. Entity must attached to an entity context. */
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.update(this);
    }

    /** Convenient call for {@link AbstractDao#refresh(Object)}. Entity must attached to an entity context. */
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.refresh(this);
    }

}
