package me.cosmi.mad.practical.ui.main;

import android.view.View;

import me.cosmi.mad.practical.ui.base.BaseListenerHolder;

public class MainListenerHolder extends BaseListenerHolder<MainViewModel> {

    public MainListenerHolder(final MainViewModel viewModel) {
        super(viewModel);
    }

    public void buttonFollow(final View view) {
        this.viewModel.invertFollowStatus();
        this.viewModel.loadUserData();
    }
}
