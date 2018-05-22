import spock.lang.Specification

class MedianaTestSpec extends Specification{
	
	def "getting median from a number list"() {
		
		given:
		def list = [6,3,5]

		when: 
		list = list.sort()
		println list 
		then: 
		assert list == [3,5,6]
	}

}

 
