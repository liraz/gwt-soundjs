package org.lirazs.gwtsoundjs.test.client;

import com.google.gwt.junit.client.GWTTestCase;
import org.lirazs.gwtsoundjs.client.SoundJs;
import org.lirazs.gwtsoundjs.client.SoundJsGwtEntryPoint;
import org.sgx.jsutil.client.SimpleCallback;

/**
 * Created on 23/10/2015.
 */
public class GwtTestSoundJs extends GWTTestCase {

    public String getModuleName() {
        return "org.lirazs.gwtsoundjs.test.SoundJsGwtTest";
    }

    public void gwtSetUp() {
        new SoundJsGwtEntryPoint().onModuleLoad();
    }

    public void gwtTearDown() {
    }

    public void testSoundLoadAndPlay() {
        //TODO: HtmlUnit emulation does not support sound at all, so it cannot really be tested here.
        delayTestFinish(5000);

        SoundJs.setAlternateExtensions("mp3");

        SoundJs.onFileLoad(new SimpleCallback() {
            @Override
            public void call() {
                SoundJs.play("indiaAnthem");
                finishTest();
            }
        });
        SoundJs.registerSound("http://www.sample-videos.com/audio/mp3/india-national-anthem.mp3", "indiaAnthem");
    }
}
