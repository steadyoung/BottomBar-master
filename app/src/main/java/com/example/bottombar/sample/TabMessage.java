package com.example.bottombar.sample;

/**
 * Created by iiro on 7.6.2016.
 */
public class TabMessage {
    public static String get(int menuItemId, boolean isReselection) {
        String message = "选择了： ";

        switch (menuItemId) {
            case R.id.bb_menu_recents:
                message += "最近";
                break;
            case R.id.bb_menu_favorites:
                message += "收藏";
                break;
            case R.id.bb_menu_nearby:
                message += "附近";
                break;
            case R.id.bb_menu_friends:
                message += "朋友";
                break;
            case R.id.bb_menu_food:
                message += "食物";
                break;
        }

        if (isReselection) {
            message += "！选择！";
        }

        return message;
    }
}
