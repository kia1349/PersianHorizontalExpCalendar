package com.mohamadian.persianhorizontalexpcalendar.view.cell;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import com.mohamadian.persianhorizontalexpcalendar.R;

/**
 * Created by Tasnim on 10/27/2017.
 */

public class LabelCellView extends BaseCellView {

    private TextView text;

    public LabelCellView(Context context) {
        super(context);
        init();
    }

    public LabelCellView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public LabelCellView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        initView();
    }

    private void initView() {
        inflate(getContext(), R.layout.label_cell_view, this);
        text = (TextView) findViewById(R.id.text);
    }

    public void setText(String text) {
        this.text.setText(text);
    }

    public void setDayType(DayType dayType) {
        this.dayType = dayType;
        setTextBackgroundByDayType();
    }
}
