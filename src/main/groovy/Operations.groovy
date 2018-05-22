class Operations{

	def getting_median(def list){
		def clone_list , median , middle_list = null
 
		clone_list = list.collect().sort()
		middle_list = list.size().intdiv(2)

		median = list.size()%2 ? clone_list[middle_list] : (clone_list[middle_list - 1] + clone_list[middle_list])/ 2
	}
	
}