/*
var TinyMCE_Maxlength = {

	_maxlength_onchange_callback : false,
	_maxlength_value : false,
	_maxlength_lastContent : '',

	getInfo : function() {
		return {
			longname : 'Maxlength',
			author : 'John Dimalta',
			authorurl : 'http://www.fruitili.com',
			infourl : 'http://www.fruitili.com/annuaire/document.php?docid=3',
			version : "1.0"
		};
	},

	initInstance : function(inst) {
		this._maxlength_onchange_callback=tinyMCE.getParam("maxlength_onchange_callback", false);
		this._maxlength_value=tinyMCE.getParam("maxlength_value", false);
	},

	handleNodeChange : function(editor_id, node, undo_index, undo_levels, visual_aid, any_selection) {
		if(this._maxlength_value)
			this._Maxlength();
	},

	setupContent : function(editor_id, body, doc) {
		var content=tinyMCE.getContent();
		if(content.length<this._maxlength_value)
			this._maxlength_lastContent=content;
	},

	onChange : function(inst) {
		if(this._maxlength_value)
			this._Maxlength();
	},

	handleEvent : function(e) {
		if(this._maxlength_value)
			this._Maxlength();
		return true;
	},

	_Maxlength : function() {
		var content=tinyMCE.getContent();
		var len=content.length;
		if(len>this._maxlength_value){
			tinyMCE.setContent(this._maxlength_lastContent);
		}else{
			this._maxlength_lastContent=content;
		}
		if(this._maxlength_onchange_callback)
			eval(this._maxlength_onchange_callback+'(len);');
		return 1;
	}
};

//tinyMCE.addPlugin("maxlength", TinyMCE_Maxlength);
tinyMCE.onInit.add(TinyMCE_Maxlength.init, TinyMCE_Maxlength);
*/
