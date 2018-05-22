import spock.lang.Specification

class MedianaTestSpec extends Specification{
	
	def "Getting median from a odd list"() {
		
		given:
		def list = [6,3,5]
		def clone_list , median , middle_list = null

		when: 
		clone_list = list.collect().sort()
		middle_list = list.size().intdiv(2)

		median = list.size()%2 ? clone_list[middle_list] : (clone_list[middle_list - 1] + clone_list[middle_list])/ 2		

		then: 
		assert median == 5
	}

}

 
