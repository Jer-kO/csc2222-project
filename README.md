# csc2222-project

Lock-free data structures are those that may be queried and updated concurrently by multiple processes without the use of locks. In order to achieve lock-freedom, operations typically help other operations that must update the same part of the data structure. We give a new implementation of a lock-free binary search tree, called a k-lazy binary search tree (BST), using a lazy helping heuristic, in which for a fixed number of steps, processes do not perform any helping. We show a k-lazy BST has amortized step complexity O(h + N), where h is the height of the BST and N is the number of processes in the system. In all scenarios tested, our k-lazy BST performs better than another lock-free BSTs with the same amortized step complexity.

Experiments were run on an m5d.8xlarge Amazon EC2 instance, with 32 virtual CPUs. The implementations of the k-lazy BST, EFBR-BST, and EFHR-BST can be cloned from the following git repository:

git clone git@github.com:Jer-kO/csc2222-project.git

The following Java 8 version was installed

sudo yum install java-1.8.0-openjdk-devel

The source code can be compiled into a bin folder using javac:

javac -d bin/ -cp src src/main/Main.java

When running the testing framework, the first four input arguments specify the number of threads, number of trials, number of seconds per trial, and the type of algorithm to test, respectively. The type of algorithm must be one of {``KLazy'', ``EFBR'', ``EFHR'', ``SkipList''}. The percentage of Insert and Delete operations is specified using the -ins# and -del# options. The remainder of the operations are Search operations. The key range is specified with the -keys# option. Finally, the output file containing the results is specified with the file# option.

For example, running the command

java -cp bin main.Main 32 3 30 KLazy -ins50 -del50 -keys1000 -file-klazy4\_50\_50\_1000.csv

runs an experiment with 32 threads, 3 trials, 30 seconds per trial, on the $k$-lazy BST with a 50%-50% Insert to Delete ratio on a key range of [0,1000]. Results of all trials are recorded in a new file called klazy4\_50\_50\_1000.csv. In particular, the file contains a column labeled throughput, which was used to generate all results reported in this paper. The reported throughput was the average of all trials.
