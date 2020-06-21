angular.module("crudapp").factory('Employee',Employee);

Employee.$inject = ['$resource'];

function Employee($resource){
	var resourceurl = 'api/employee/:id';
	
	return $resource(resourceurl,{},{
		"update":{
			method:"PUT"
		}
	});
}