package swpuiot.com.dagger2learn.component;

import dagger.Component;
import swpuiot.com.dagger2learn.MainActivity;
import swpuiot.com.dagger2learn.module.ActivityModule;

/**
 * Created by tgs on 17-9-3.
 */
@Component(modules = ActivityModule.class)
public interface MainComponent {
    void inject(MainActivity activity);
}
