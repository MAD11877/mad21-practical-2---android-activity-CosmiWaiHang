package me.cosmi.mad.practical.ui.base;

public abstract class BaseListenerHolder<MODEL extends BaseViewModel> {

    protected final MODEL viewModel;

    public BaseListenerHolder(final MODEL viewModel) {
        this.viewModel = viewModel;
    }
}
