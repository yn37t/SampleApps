package jp.yn37t.myapp;

import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

import jp.yn37t.util.YnLog;

/**
 * Created by yn37t on 2016/12/10.
 */

public class DialogTestActivity extends Activity {
    private final String TAG = DialogTestActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        YnLog.v(TAG, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empty);
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);

        DialogFragment fragment = new CustomDialogFragment();
        fragment.show(getFragmentManager(), "contact_us");
    }

    /**
     * Custom Dialog
     */
    static public class CustomDialogFragment extends DialogFragment {
        private final String TAG = CustomDialogFragment.class.getSimpleName();

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            YnLog.v(TAG, "onCreateDialog");

            Dialog dialog = new Dialog(getActivity());

            // タイトル非表示
            dialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);

            dialog.setContentView(R.layout.fragment_custom_dialog);

            /**
             // フルスクリーン
             dialog.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
             WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN);
             // 背景を透明にする
             dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
             */

            Activity activity = getActivity();
            if (activity != null) {
                ViewGroup rootView = (ViewGroup) activity.findViewById(android.R.id.content);
                View childView = rootView.getChildAt(0);

                WindowManager.LayoutParams lp = dialog.getWindow().getAttributes();
                lp.width = childView.getWidth() * 3 / 4;
                lp.height = childView.getHeight() * 3 / 4;
                dialog.getWindow().setAttributes(lp);
            }

            return dialog;
        }
    }
}
