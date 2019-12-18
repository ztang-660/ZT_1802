package com.jihe;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStream_test {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("张伞","李氏","张小妹","张阳");
		Stream<String>  ps=list.parallelStream();
		if(ps.isParallel()) {
			System.out.println("只是一个并行流");
		}
	}

}
