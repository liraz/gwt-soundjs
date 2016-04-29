package org.lirazs.gwtsoundjs.client;

import com.google.gwt.core.client.JavaScriptObject;
import org.sgx.jsutil.client.SimpleCallback;

/**
 * Contains static methods for calling the createjs.Sound api.
 * Note, javadocs copied & compressed from soundjs.com site
 *
 * @author Liraz
 */
public class SoundJs extends JavaScriptObject {

    protected SoundJs() {}

    /**
     * @param extensions
     *
     * @return
     */
    public static final native void setAlternateExtensions(String ...extensions)/*-{
        $wnd.createjs.Sound.alternateExtensions = @org.sgx.jsutil.client.JsUtil::toJsArrayString([Ljava/lang/Object;)(extensions);
    }-*/;

    /**
     *
     * @param soundsLoadedCallback
     * @return
     */
    public static final native SoundJs onFileLoad(SimpleCallback soundsLoadedCallback) /*-{
        var callback = @org.sgx.jsutil.client.JsUtil::toJsFunction(Lorg/sgx/jsutil/client/SimpleCallback;)(soundsLoadedCallback);
        $wnd.createjs.Sound.on("fileload", callback);
    }-*/;

    /**
     * This parameter can be an instance of {{#crossLink "PlayPropsConfig"}}{{/crossLink}} or an Object that contains any or all optional properties by name,
     * including: interrupt, delay, offset, loop, volume, pan, startTime, and duration (see the above code sample).
     * <br /><strong>OR</strong><br />
     * <b>Deprecated</b> How to interrupt any currently playing instances of audio with the same source,
     * if the maximum number of instances of the sound are already playing. Values are defined as <code>INTERRUPT_TYPE</code>
     * constants on the Sound class, with the default defined by {{#crossLink "Sound/defaultInterruptBehavior:property"}}{{/crossLink}}.
     *
     * @param soundId
     * @return
     */
    public static final native SoundJs play(String soundId) /*-{
        return $wnd.createjs.Sound.play(soundId);
    }-*/;

    /**
     * channels for an audio instance, however a "channels" property can be appended to the data object if it is used
     * for other information. The audio channels will set a default based on plugin if no value is found.
     * Sound also uses the data property to hold an {{#crossLink "AudioSprite"}}{{/crossLink}} array of objects in the following format {id, startTime, duration}.<br/>
     *   id used to play the sound later, in the same manner as a sound src with an id.<br/>
     *   startTime is the initial offset to start playback and loop from, in milliseconds.<br/>
     *   duration is the amount of time to play the clip for, in milliseconds.<br/>
     * This allows Sound to support audio sprites that are played back by id.
     *
     * @param soundId
     * @return
     *      LoadedSoundItem
     *      {src: src, id: id, data:data, defaultPlayProps:defaultPlayProps}
     */
    public static final native void registerSound(String path, String soundId) /*-{
        $wnd.createjs.Sound.registerSound(path, soundId);
    }-*/;
}
