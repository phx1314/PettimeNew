//
//  AdaMain
//
//  Created by DELL on 2019-03-22 16:44:22
//  Copyright (c) DELL All rights reserved.


/**

 */

package com.ndtlg.pettimenew.ada;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import com.mdx.framework.adapter.MAdapter;
import com.ndtlg.pettimenew.item.Main;
import com.ndtlg.pettimenew.model.ModelData;

import java.util.List;

public class AdaMain extends MAdapter<ModelData> {

    public AdaMain(Context context, List<ModelData> list) {
        super(context, list);
    }


    @Override
    public View getview(int position, View convertView, ViewGroup parent) {
        final ModelData item = get(position);
        if (convertView == null) {
            convertView = Main.getView(getContext(), parent);
        }
        Main mMain = (Main) convertView.getTag();
        mMain.set(item);

        return convertView;
    }
}
