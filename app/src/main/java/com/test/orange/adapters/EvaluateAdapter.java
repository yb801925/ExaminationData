package com.test.orange.adapters;

import android.support.annotation.Nullable;

import com.recycler.baseholder.BaseQuickAdapter;
import com.recycler.baseholder.BaseViewHolder;
import com.test.orange.R;

import java.util.List;

public class EvaluateAdapter extends BaseQuickAdapter<String,BaseViewHolder> {
    public EvaluateAdapter(@Nullable List<String> data) {
        super(R.layout.evaluate_adapter_layout, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {

    }
}