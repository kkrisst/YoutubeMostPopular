package n358vu.krisa.youtubemostpopular;

import javax.inject.Singleton;

import dagger.Component;
import n358vu.krisa.youtubemostpopular.interactor.InteractorModule;
import n358vu.krisa.youtubemostpopular.model.mock.MockModelModule;
import n358vu.krisa.youtubemostpopular.view.ViewModule;

/**
 * Created by mobsoft on 2016. 05. 06..
 */
@Singleton
@Component(modules = {ViewModule.class, InteractorModule.class, MockModelModule.class})
public interface MockYoutubeMostPopularApplicationComponent extends YoutubeMostPopularApplicationComponent{
}
