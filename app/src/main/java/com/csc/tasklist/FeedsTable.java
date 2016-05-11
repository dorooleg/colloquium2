package com.csc.tasklist;

import android.provider.BaseColumns;

interface FeedsTable extends BaseColumns {
    String TABLE_NAME = "TTASKLIST";

    String COLUMN_HEADER = "CHEADER";
    String COLUMN_BODY = "CBODY";
    String COLUMN_DATE = "CDATE";
    String COLUMN_DONE = "CDONE";
    String COLUMN_STAR = "CSTAR";
    String COLUMN_COLOR = "CCOLOR";

    String TAGS_TABLE = "TTAGSLIST";
    String TAGS_COLUMN_TASKID = "CTASKID";
    String TAGS_COLUMN_BODY = "CBODY";
}
