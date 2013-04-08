package org.jblooming.waf.constants;

public interface GroupConstants extends Commands {

  String GROUP = "GROUP";

// form fields
  String FLD_ID = Fields.FORM_PREFIX + GROUP + "FLD_ID";
  String FLD_NAME = Fields.FORM_PREFIX + GROUP + "FLD_NAME";
  String FLD_TYPE = Fields.FORM_PREFIX + GROUP + "FLD_TYPE";
  String FLD_GROUP_SEARCH = Fields.FORM_PREFIX + "GROUP_SEARCH";

// commands
  String CMD_GROUP_CHOOSE = COMMAND + "GROUP_CHOOSE";
  String CMD_SEARCH_GROUP = COMMAND + "SEARCH_GROUP";
  String CMD_GROUP_UNLINK = COMMAND + "GROUP_UNLINK";
  String CMD_FIND_GROUP_CANDIDATES = COMMAND + "fgrcnd";
  String CMD_LINK_GROUPS = COMMAND + "lnkgrp";
  String CMD_GROUP_DELETE = COMMAND + "grpdel";

// session scoped
// i18n
  String I18N_LIST = GROUP + "LIST";
  String I18N_MULTIPLE = GROUP + "MULTIPLE";
  String I18N_UNLINK = GROUP + "UNLINK";
  String I18N_CREATE = GROUP + "CREATE";
  String I18N_DELETE = GROUP + "DELETE";
  String I18N_LINK = GROUP + "LINK";

// configured urls
  String PART_GROUP_DELETE = "PART_GROUP_DELETE";
  String PART_GROUP_EDITOR = "PART_GROUP_EDITOR";
  String PART_GROUP_LIST = "PART_GROUP_LIST";
  String ZOOM_GROUP = "ZOOM_GROUP";

// errors
  String ERR_EXISTING_GROUP = "EXISTING_GROUP";

// other constants



  String I18N_SEARCH_GROUP =  GROUP + "SEARCH";
  String I18N_ADD_GROUP = GROUP+"ADD";

  String FLD_GROUP_NAME = "GROUP_NAME";
  String ID_TABTABLE_SEARCH_OPERATOR = "ID_TABTABLE_SEARCH_OPERATOR";
  String TAB_SEARCH_OP_ANAGDATA = "TAB_SEARCH_OP_ANAGDATA";
  String TAB_SEARCH_OP = "TAB_SEARCH_OP";

  String I18N_DELETE_GROUP= "DELETE_GROUP";
  String I18N_GROUP_STATE= "GROUP_STATE";
  String I18N_GROUP_LIST = "GROUP_LIST";
  String ERROR_NAME_GROUP_REQUIRED = "ERROR_NAME_GROUP_REQUIRED";
  String I18N_EDIT_GROUP = "I18N_EDIT_GROUP";
}