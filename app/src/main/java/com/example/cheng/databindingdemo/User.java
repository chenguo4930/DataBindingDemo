package com.example.cheng.databindingdemo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableArrayMap;
import android.databinding.ObservableBoolean;

/**
 * Created by cheng on 2016/11/14.
 */

public class User extends BaseObservable {
    private String mFirstName;
    private String mLastName;
    public ObservableBoolean isFired = new ObservableBoolean();

    public ObservableArrayMap<String,String> userMaps = new ObservableArrayMap<>();

    public ObservableArrayList userLists = new ObservableArrayList();

    public User(String firstName, String lastName) {
        mFirstName = firstName;
        mLastName = lastName;
        isFired.set(false);
        userMaps.put("hello","world");
        userMaps.put("hi","world");
        userMaps.put("yo","world");

        userLists.add(new Son("java",18));
        userLists.add(new Son("android",6));
    }

    @Bindable
    public String getFirstName() {
        return mFirstName;
    }

    @Bindable
    public String getLastName() {
        return mLastName;
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }

    public void setLastName(String lastName) {
        this.mLastName = lastName;
        notifyPropertyChanged(BR.lastName);
    }

    public void setFired(boolean fired) {
        isFired.set(fired);
    }
}
