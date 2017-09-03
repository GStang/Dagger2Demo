package swpuiot.com.dagger2learn.presenter;

import javax.inject.Inject;

import swpuiot.com.dagger2learn.bean.User;
import swpuiot.com.dagger2learn.modle.UserModel;
import swpuiot.com.dagger2learn.view.MainView;

/**
 * Created by tgs on 17-9-3.
 */

public class MainPresenter {
    private MainView mView;
    private UserModel model = new UserModel();
    private User user;

    @Inject
    public MainPresenter(MainView mView,User user) {
        this.mView = mView;
    }
    public void register(){
        model.register();
        mView.toast();
    }
}
