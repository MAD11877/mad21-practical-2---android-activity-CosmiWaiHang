package me.cosmi.mad.practical.ui.main;

import androidx.lifecycle.MutableLiveData;

import me.cosmi.mad.practical.data.domain.User;
import me.cosmi.mad.practical.ui.base.BaseViewModel;

public class MainViewModel extends BaseViewModel {

    private final MutableLiveData<User> userLiveData = new MutableLiveData<>();
    private final User user;

    public MainViewModel(final User user) {
        this.user = user;
    }

    public void loadUserData() {
        this.userLiveData.postValue(this.user);
    }

    public MutableLiveData<User> getUserLiveData() {
        return this.userLiveData;
    }

    public User getUser() {
        return this.userLiveData.getValue();
    }

    public void invertFollowStatus() {
        this.user.setIsFollowed(!this.user.isFollowed());
    }
}
