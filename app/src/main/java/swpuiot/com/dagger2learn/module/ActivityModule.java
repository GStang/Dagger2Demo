package swpuiot.com.dagger2learn.module;

import dagger.Module;
import dagger.Provides;
import swpuiot.com.dagger2learn.MainActivity;
import swpuiot.com.dagger2learn.bean.User;
import swpuiot.com.dagger2learn.presenter.MainPresenter;

/**
 * Created by tgs on 17-9-3.
 */

@Module
public class ActivityModule {
    private MainActivity activity;

    public ActivityModule(MainActivity activity) {
        this.activity = activity;
    }

    @Provides
    public MainActivity provideActivity() {
        return activity;
    }

    @Provides
    public MainPresenter presenter(MainActivity activity, User user) {
        return new MainPresenter(activity, user);
    }

    @Provides
    public User provideUser() {
        return new User();
    }
}
