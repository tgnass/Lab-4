/*
‘LAB #4
‘Fall 2015
‘Tyler Gnass
‘I fully understand the following statement.
‘OU PLAGIARISM POLICY
‘All members of the academic community at Oakland are expected to practice and uphold
‘standards of academic integrity and honesty. An instructor is expected to inform and instruct
‘students about the procedures and standards of research and documentation required of
students ‘in fulfilling course work. A student is expected to follow such instructions and be
sure the rules ‘and procedures are understood in order to avoid inadvertent misrepresentation
of his work. ‘Students must assume that individual (unaided) work on exams and lab reports
and documentation ‘of sources is expected unless the instructor specifically says that is not
necessary.
‘The following definitions are some examples of academic dishonesty:
 ‘Plagiarizing from work of others. Plagiarism is using someone else's work or ideas
without ‘giving the other person credit; by doing this, a student is, in effect, claiming
credit for ‘someone else's thinking. Whether the student has read or heard the
information he uses, ‘the student must document the source of information. When
dealing with written sources, ‘a clear distinction would be made between quotations
(which reproduce information from ‘the source word-for-word within quotation marks)
and paraphrases (which digest the ‘source information and produce it in the student's
own words). Both direct quotations and ‘paraphrases must be documented. Just because
a student rephrases, condenses or selects ‘from another person's work, the ideas are
still the other person's, and failure to give ‘credit constitutes misrepresentation of the
student's actual work and plagiarism of ‘another's ideas. Naturally, buying a paper and
handing it in as one's own work is ‘plagiarism.
 ‘Cheating on lab reports falsifying data or submitting data not based on student's own
work.
*/

package problem3;

public class GenericBinarySeacher {

	public static <T> int search(T[] array, T value) {
		int mid;
		int low = 0;
		int high = array.length - 1;
		
		while(low <= high) {
			mid = (low + high) / 2;
			if(((Comparable<T>) array[mid]).compareTo(value) < 0) {
				low = mid + 1;
			} else if(((Comparable<T>) array[mid]).compareTo(value) > 0) {
				high = mid - 1;
			} else {
				return mid;
			}
		}
		
		return -1;
	}
}
