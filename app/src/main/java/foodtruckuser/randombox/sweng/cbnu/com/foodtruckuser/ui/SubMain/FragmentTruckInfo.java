package foodtruckuser.randombox.sweng.cbnu.com.foodtruckuser.Ui.SubMain;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import foodtruckuser.randombox.sweng.cbnu.com.foodtruckuser.R;

/**
 * Created by Ratan on 7/29/2015.
 */
public class FragmentTruckInfo extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_truckinfo,null);
    }


}
