package co.edureka.util.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapOnList {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("java","is","a","programming", "language");
		System.out.println(words);
		
		//-- requirement - convert each element of list to capital letters using Stream
		Stream<String> upperCaseWordsStream = words.stream().map(element -> element.toUpperCase());
		List<String> upperWords = upperCaseWordsStream.collect(Collectors.toList());
		
		System.out.println("Original List ---> " + words);
		System.out.println("Modified List ---> " + upperWords);
	}

}
