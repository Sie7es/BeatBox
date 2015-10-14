package es.canada.victor.beatbox;

/**
 * Created by victorcanadaojeda on 13/10/15.
 */
public class Sound {
    private String mAssetPath;
    private String mName;
    private Integer mSoundId; // if mSoundId haven't value , it will should be null.

    public Sound(String assetPath) {
        mAssetPath = assetPath;
        String[] components = assetPath.split("/");
        String filename = components[components.length -1];
        mName = filename.replace(".wav", "");
    }


    public String getAssetPath() {
        return mAssetPath;
    }


    public String getName() {
        return mName;
    }

    public Integer getSoundId() {
        return mSoundId;
    }

    public void setSoundId(Integer soundId) {
        mSoundId = soundId;
    }
}
