package kr.ac.kaist.kyotong.model;

import android.content.Context;

import kr.ac.kaist.kyotong.R;
import kr.ac.kaist.kyotong.utils.prefs.ShuttlePreference;

/**
 * Created by yearnning on 15. 1. 26..
 */
public class ShuttleModel {

    public static ShuttleModel newInstance(Context context, int id) {

        /**
         *  KAIST
         */
        if (id == 1) {
            return newInstance(context,
                    1,
                    ShuttleModel.Type.BUS,
                    R.string.tab_kaist_olev,
                    R.string.tab_kaist_olev_explain);
        } else if (id == 2) {
            return ShuttleModel.newInstance(context,
                    2,
                    ShuttleModel.Type.BUS,
                    R.string.tab_kaist_sunhwan,
                    R.string.tab_kaist_sunhwan_explain);
        } else if (id == 3) {
            return ShuttleModel.newInstance(context,
                    3,
                    ShuttleModel.Type.BUS,
                    R.string.tab_kaist_wolpyeong,
                    R.string.tab_kaist_wolpyeong_explain);
        } else if (id == 4) {
            return ShuttleModel.newInstance(context,
                    4,
                    ShuttleModel.Type.TASHU,
                    R.string.tab_kaist_tashu,
                    -1);
        } else if (id == 5) {
            return ShuttleModel.newInstance(context,
                    5,
                    ShuttleModel.Type.TAXI,
                    R.string.tab_kaist_taxi,
                    R.string.tab_kaist_taxi_explain);
        }

        /**
         * 공주대학교
         */
        else if (id == 6) {
            return newInstance(context,
                    6,
                    ShuttleModel.Type.BUS,
                    R.string.tab_kongju_ys,
                    R.string.tab_kongju_ys_explain);
        }

        return null;
    }

    private static ShuttleModel newInstance(Context context,
                                            int id,
                                            Type type,
                                            int title,
                                            int explain) {
        ShuttleModel shuttleModel = new ShuttleModel();
        shuttleModel.id = id;
        shuttleModel.type = type;
        shuttleModel.title = title;
        shuttleModel.explain = explain;
        shuttleModel.weight = ShuttlePreference.getWeight(context, id);
        return shuttleModel;
    }


    public enum Type {
        BUS, TASHU, TAXI
    }

    public int id = -1;
    public Type type = null;
    public int title = -1;
    public int explain = -1;
    public int weight = 0;
    public boolean panelExpand = false;
}
