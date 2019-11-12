//
//  FrgMain
//
//  Created by DELL on 2019-03-22 16:44:22
//  Copyright (c) DELL All rights reserved.


/**

 */

package com.ndtlg.pettimenew.frg;

import android.os.Bundle;

import com.ab.view.listener.AbOnListViewListener;
import com.mdx.framework.adapter.MAdapter;
import com.ndtlg.pettimenew.R;
import com.ndtlg.pettimenew.ada.AdaMain;
import com.ndtlg.pettimenew.bean.BeanMSchDevice;
import com.ndtlg.pettimenew.model.ModelData;
import com.ndtlg.pettimenew.model.ModelList;

import java.util.ArrayList;
import java.util.List;

import static com.ndtlg.pettimenew.F.MSchDevice;
import static com.ndtlg.pettimenew.F.json2Model;


public class FrgMain extends BaseFrg {


    public com.ndtlg.pettimenew.view.AbPullListView mAbPullListView;

    @Override
    protected void create(Bundle savedInstanceState) {
        setContentView(R.layout.frg_main);
        initView();
        loaddata();
    }

    @Override
    public void disposeMsg(int type, Object obj) {
        switch (type) {
            case 0:
                mAbPullListView.pullLoad();
                break;
        }
    }

    private void initView() {
        findVMethod();
    }

    private void findVMethod() {


        mAbPullListView = (com.ndtlg.pettimenew.view.AbPullListView) findViewById(R.id.mAbPullListView);
    }

    public void loaddata() {
        mAbPullListView.setGetApiLoadParams(MSchDevice, new BeanMSchDevice());
        mAbPullListView.setAbOnListViewListener(new AbOnListViewListener() {
            @Override
            public MAdapter onSuccess(String methodName, String content) {
                ModelList mModelList = (ModelList) json2Model(content, ModelList.class);
                mModelList.data.deviceList.add(new ModelList.DataBean.DeviceListBean());
                List data = new ArrayList();
                for (int i = 0; i < mModelList.data.deviceList.size(); i++) {
                    if (i % 2 == 0) {
                        ModelData mModelData = new ModelData();
                        for (int j = i; j < Math.min(mModelList.data.deviceList.size(), i + 2); j++) {
                            mModelData.mList.add(mModelList.data.deviceList.get(j));
                        }
                        data.add(mModelData);
                    }
                }
                return new AdaMain(getContext(), data);
            }
        });
    }


}