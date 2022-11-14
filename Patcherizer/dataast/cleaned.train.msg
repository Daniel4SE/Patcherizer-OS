Fix WTF when creating a lazily initialized connection 
Fixed a bug where the notification scroller could crash . 
Added missing call to super . close ( ) . 
make shared variable volatile 
Removed non - needed imports 
help topic ( PY - 4665 ) 
Add keys . add ( key ) 
removed todo on vetoesHiding , reviewed 
Add @ Incubating to override of API ' withCancellationToken ' 
make brokerhosts serializable 
Make a variable final 
Fix for issue 27 
Fix DeletionRetentionStrategy # configurationClass ( ) 
Corrected description of CommandSender . getServer ( ) 
corrected type 
remove space 
Made validation util also have private constructor to prevent initialization 
DO NOT MERGE Tweak overscroll 
Bring back warnings 
Remove unused import . 
make round avatars a little bigger with a smaller border 
Should fix black laser beams . 
Fix tests 
avoid compiler warning 
Updated TODO 
extending async testunit timeout 
Add missing @ Override 
Use new AndroidUtils . executeOnPool . 
LPS - 35134 Fix small issue detected 
set component configurations correctly for trident spouts 
Add http timeout as well as socket timeout 
Properly stop server . 
Remove an unnecessary empty line 
Updated version 
None
changed default param name 
Fix hotswap 
Don ' t create domain objects on demand just by property reference 
do not hide non - dumb - aware actions , just disable them 
Remove warnings 
Fix power provider 
Avoid splitting overloaded methods 
Fix RegTestParams subsidy decrease block count ( 150 ) 
Grant read permissions to attachments 
remove circular reference in generics 
Removed print statement which was probably set during debugging 
remove test files after completion 
Fix the missing return type for method references 
Renamed glassfish tree benchmark . 
Fixed missing output dir for asset bundle processing 
fixed findbugs 
LPS - 43332 Do not strip HTML from description in getSummary method 
Add @ Deprecated annotations to declarations with @ deprecated javadoc tags 
Delete @ Optional in data . media . Media class 
Make another member final 
Make the save password selected by default . 
Add destroyed check 
highlighted cells not refreshing fix 
Removed spurious break . 
Don ' t null onTouchListener , now this class no longer implements it . 
removed import from sample project 
prevent read / write after close 
Add GC thread to RSGL . 
refs # 304 fixed crash if background and second scale is used together 
corrected documentation 
Fix test compilation 
Removed extra empty lines to fix the build failure 
suppress contract validation for wrong Logger . assertTrue 
help topic ( PY - 1911 ) 
Fix a typo on TvContract . 
Fix build . 
improve reliability of MyAccountPageTest 
Added RGBA4444 
add new forced upgrade API , deprecate setForcedUpgradeVersion ( ) 
Add missing @ Override in SpongeGame 
Add missing super in test 
Fix debug log for SpellCheckerSessionListenerImpl # TASK_CANCEL 
Turn off " ignore libraries " option by default 
get request source 
Making Undertow class final 
Fixing the delete mount point journaling . 
disable caching explicitly to get rid of useless log entry 
removed unused import 
Expose content uri 
Make mSessionCallback null in TvView . unbindTvInput 
LPS - 27739 Site admins without Control Panel access cannot manage page or site pages 
Fix Javadoc nag 
Reorder TypeInfo . Type enum so ordinals back to orginal value 
accessing wrong var 
Allow content packs to avoid grok patterns field 
Make Wrench full 3D 
don ' t show empty Python code style settings page ; fix Python preview text 
LPS - 62799 Fix NullPointer in test 
enable new building model 
Reverted commit 76c8630367c027873cd1e2d28b6a27eb9f082b5d 
Dependency parser should provide dependencies 
remove irrelevant suppression 
adding scope to group does not update containing inspections in tree view 
added print stack trace 
Trivial Javadoc commit to trigger a CI build 
convert bytes to hex for BytesType . getString ( ) 
Remove unnecessary code 
Fix back popping the back stack too much . 
Added FIXME item 
Fix a ViewPager bug repopulating after a data set change that removed 
Add specification name to version number 
Fixed GsdEnterAlwaysCollapsedParallaxFragment examples 
fix missing imports for anonymous classes 
Fix a description of a ViewPagerAction for tests . 
Fix BufferedTokenStream . reset ( ) putting the stream in an invalid state when called before lazyInit 
Fix build 
Remove unused variable . 
LPS - 47071 Missed one 
i will get it right 
LPS - 65497 Fix updateModifiedDate 
Fix screen magnifier scaling due to ScaleGestureDetector changes . 
LPS - 36115 Fix incorrect logic ? 
Restoring most recent items first 
Prevent reflective instantiation by masochists . 
set version 
Removed unused method . 
CLJ - 1338 - make Murmur3 public 
LPS - 27783 add method to WorkflowedModel 
Increasing uninterrupted sleep quantum in SQLiteDatabase to increase transaction size . 
Make TemplateResource public ( to make it reusable from other frameworks ) 
Removed debug line . 
Saving Blacklist and Hold for Moderation lists when dismissing dialog 
Remove " final " keyword from Number3D class 
Rename method 
add dynamic change maxActive support 
fixed bug with services shutting down by itself 
Removed pipeline . getState ( ) call from start ( ) , it hangs capture on windows 
Fixed isPackage ( ) check for module files 
Make sure out counts our current before attempting to use them for sorting 
fix hide - > quit issue 
Fix whitespaces 
Fix camera getMeteringAreas does not return areas correctly . 
added Nullable annotations 
fix bug in dataPath ( ) 
LPS - 36595 Do not display Manage Site Membership in Control Panel when the Site membership policy doesn ' t allow manual membership 
Fix bug 5244365 - Don ' t populate a ViewPager in onAttachedToWindow 
Reset the inverse of the modelview in resetMatrix ( ) . 
Print objects to out & err ( closes # 17 ) 
don ' t clear selection during repaint to avoid blinking of test ' s tree when selection is hold by a leaf of a collapsed node 
Fix checkstyle 
Fix # 198 , optimize initLazyView ( ) callback timing in the ViewPager scene . 
Don ' t recycle native bitmap after the finalizer is called . 
Fix formatting 
LPS - 18560 Source formatting missed the break 
made PGLListener constructor public 
Removed Scrollbar 
Fix memory leak and slowness in keyguard 
Fix checkstyle issues 
do not use Sun ' s internal NotImplementedException , use the standard UnsupportedOperationException instead 
added code to visit sibling nodes 
Remove unnecessary empty line 
remove extra import in BusinessSubscriptionTransitionRecorder 
File type renamed 
Removed a sysout I missed . 
Correct a typo 
Avoid NPE when trying to do access logging on cookies for an unmapped request . 
Add one way to construct BlockStoreMeta cheaply . 
Reverting back to TopicOffsetOutOfRangeException extends RunTimeException . 
Fix check style 
Fix splash progress disappearing on image repaint 
unique id contains site name 
Fixing special handling of presence type in the model 
Oops , typo caused infinite loop 
Fix documentation for Wifi ScanResult . timestamp 
Fix # 675 
Remove comment 
added missing chain to superclass 
Expose NETWORK_SCORE_SERVICE as @ SystemApi . 
Remove $ Revision keyword from files in jasper / * * 
add missing period to save as extension 
Fix NullPointerException in XML . toString ( object , tagName ) 
LPS - 59252 Add Layout into request so that we can fetch its group ID when calculating locale . 
Fixed compilation error . 
Removed redundant PermissionsResolver . load ( ) call 
Remove unused WebApplicationContext property 
Accessibility events fired from AdapterView underpopulated . 
Remove hardcoded position for scrollToPosition . 
disable optimizations for interfaces 
Fixed bad assertion 
Fix broken test 
Fix the ( Padding is not working properly on Android M ) . 
Make all IpReachabilityMonitor log messages have the same tag 
throw assert 
Gracefully handle apps without native libraries . 
default native proto to correct port in Config 
changed default . 
Fixed javadoc tag 
Fix notification message when moving . 
fix the build . 
Added a @ since tag to the javadoc 
update gutter size after setting LineNumberConvertor 
varargs resolve bug 
Pass the Subscription down the chain for the subscriber . 
Removed username attribute from WebAttributes class . 
add javadoc 
Restore last know good retry values 
Select the first post after refreshing if using the two pane view . 
Align Wrapper javadoc with actual implementation that was changed by r926377 . 
added constructor that takes the parent class loader 
Make Printer constructor public 
remove key lookup for account screen ( not a good place ) 
Make force protected for sub - class access 
Fix build 
Live template support for Bindows ( IDEADEV - 17261 ) 
Fix osmo login issue 
Fix builder crash # 21 
Fix bug in AttributeEqualBuilder init . 
removing unused import 
tweak comment 
fixed the code style 
call the callback on sdkInitialize 
removed unused import on line 27 
Remove uninformative Javadoc 
Remove redundant onPause from ReaderWebView when hiding view 
Fix isAnswerCorrect code 
Fix a typo in a test method name . 
Announce changes to the keyguard security message for accessibility . 
Removed debugging system out from animChannel 
stop web view loading when child browser dialog is closed 
fix potential npe 
Announce changes to the keyguard security message for accessibility . 
return a copy of the list of call participants 
Removed unnecessary fully qualified class name . 
Fix a serve memory leak by properly disposing the liquid wrapper . 
Fix build after checkThread fix merge to master 
Removing java . util . Arrays import 
Make this public to expand how the class can be used for unit tests . 
Remove useless import 
Add version to params . 
test not masking gestures for two finger tap 
update voiceRouter with currentStatus = STATUS_UNKNOWN ; while makeUturnWhenPossible is active 
Fix new camera restrictions ( untested ) 
delete an unused flag in QueryableIndexSegment 
the new snack bar hide too quick if clear previous snacks . 
Remove dead import 
Removed wrong import causing tests to fail . 
Revert " Fixed missing import " 
initialize Boolean 
French tagger now calls dontTagLowercaseWithUppercase ( ) . 
Don ' t expand the SearchView if already expanded . 
LPS - 56271 ConfigurationImpl clearCache is not resetting loaded _properties 
Update the footer indicator paint when footer color is set programmatically . 
Fix DaggerGraph against updated snapshot 
Fixed typo in SASL name . 
Flush asked once cache too 
Call AudioTrack . flush ( ) before AudioTrack . release ( ) . 
roles to become unmodifiableSet 
Fixed PMD violation ( should also fix the build ) 
ignore deleted files if they are unversioned . 
Fix typo . 
Remove an unused enum value in ` BuildRuleSuccess . Property ` . 
Now closes ReadableByteChannel after it has been read . 
add requestFocus ( ) to canvas when created 
added jacoco test coverage with the profile " test - coverage " and collected into the coverage - report module ` 
Removed PMetadata from opengl 
Tweak formatting . 
Fixed tiny initialization issue with FileCopierUnitTest 
test was using incorrect target directory - noise in source tree 
Fix recursion issue with new special item entity code . 
Fix list navigation callbacks for ActionBarView 
corrected a misuse . 
dispose project message bus in lite tests 
deleting unused field 
Disable RenderThread 
Fix hash code for method descriptor 
Fix some quality flaws 
Revert " LPS - 45166 SF " 
Check for APK tamper in HomeActivity . onResume ( ) , fix # 309 
Very stupid coding mistake . 
Change the FilterCriteria . onRecallSelection ( ) to return the already assigned tag 
Fix format . 
Remove unused code 
add missing super call , as spotted by nulano 
Added missing delay . 
remove SO_LINGER 
Fix getIntervalHistogram returning empty histogram 
Use provided context directly 
Remove redundant constructor . 
Add watched field to AcvitiyItemBase ( as used by user / friends in the 
redundant write action 
Remove unused setter from HttpConfiguration . 
update HttpUtils 
Preventing leak 
remove space 
fix error in docking station on chunk unload , fixes # 2898 
Also closes the executor containing the connections 
removed required flag for gemDirectory 
Remove unneeded " static " qualifier in QuadTree . Item interface ( thanks Cyril ) 
Removed sleep from clickOnView ( ) as requested by issue - 333 
Removed an unnecessary empty line 
Set size = 0 after MemoryCache clear 
Fixed issue when the last waypoint of a motion path was not triggering listeners 
Make executeSingle limit to 1 
updated minor mistake 
Switch WordIterator ' s BreakIterator to ICU4J 
remove duplicate annotation 
The protocol class will register the socket with the poller for another read event 
Fix / buildcraft not working in singleplayer 
use CONTENT_TYPE constant 
Skip call log entries 
fixing some tests 
IDEA - 77239 Cannot checkout project from github 
Check usage Object . wait ( ) in AbstractFailureDetector . 
ensuring id2 follows id1 
added HTTP 500 
Fix checkstyle 
corrected editor tab closing behaviour 
fixed typo in MultiTerrainLodControl causing terrains not to be removed 
setIntegerPart ( long ) doesn ' t set ARG_INTEGER_PART . 
Cache extra for on demand choice 
fixed NPE in evaluate handler 
Fix test 
Fix crash if flagging episodes . 
Make EntityJoinWorldEvent Cancelable properly 
remove trivial javadoc 
Adding method to return raw message object . 
Fix memory leak ( also delete the best model ) . 
fixed NPE when setFrameTag ( ) is called before setApkFile ( ) . 
If we have a cache - miss in repository loading , return a deep copy 
Updated version 
Fix map in V2 sourcemap due to bad entry in base64 char map . 
Call super method to prevent StackOverflowException . 
Fix variable visibility issue 
Fix JPA tests 
throw UnsupportedOperationException on newly added generateGraph ( String ) in blueprints test . 
Removed unused code 
Reset note timestamp when a change comes in for a note . 
don ' t stop processing after first dependency was found ( IDEADEV - 29885 ) 
Don ' t force all views to be asking for lights out just because somebody did . 
Remove todo for bad idea 
Shorten control showing phase 
Delete help button from postfix completion configurable 
Remove a TODO that - on reflection - is not necessary . 
Fix build 
Fix NPE , added null check in Html2Text . 
mention Django in module type description 
Fix NPE 
Fix issue with state reset 
Fix build after checkThread fix merge to master 
Fixed bug in org . parboiled . common . Reference 
Speed up user - switching wallpaper changes 
removed api namespace and updated to use cordovaPlugin for android 
Remove extraneous semicolon . 
Fix PhoneAccount parceling ( 1 / 2 ) 
Remove wrong import . 
help topics for VCS configurables ( IDEADEV - 33672 ) 
Fix checkstyle 
Made CuboidRegion ( world , . . . ) constructor clamp to world . 
Rewinding NettyResponse ' s BodyPart ByteBuffer 
Fix NPE 
Fix XHTMLText . appendBrTag ( ) 
Fix npe in getCacheTotalSize . 
enable Helpshift as default 
LRQA - 14936 Move validations out of GetterUtil 
Making value in circular queue 0 before updating position 
LPS - 57487 opens _manageServiceTrackerMap 
remove conf from subclass of mongosplitter since it is already defined in superclass . 
Return this instead of null in TimeoutStream # resume 
Ignore test with fixed port 
Removed an extraneous Log statement 
fix the architect table sometimes modifiying the world when creating blueprints , fixes # 2424 
Remove broken constructor . 
Added TODO 
add new renderer to the top of the renderers list 
removed empty migrate call in sample preference 
make Preconditions package private 
Added an empty line . 
comment broken test + getting project 
add function with zero arguments 
Don ' t throw exception if daemon isn ' t running , just return false for isRPCServerRunning ( ) 
Make the inclusion strategy for deps generation public , 
collect statistics from created field types as well as variables 
missing method from desktop version 
Add mnemonic to " Delete " button in " Branch Is Not Fully Merge " dialog appearing on branch deletion . 
Overload Methods Declaration Order Check compilable UT input 
LPS - 35992 Fix minor warning 
fix some bug 
Fix test name inacuraccy . 
Fix comment 
Fix comments 
added use - idea - classpath 
Remove redundant modifier 
Fix test resource number . 
lowering max FUL failed attempts to 3 
Removed some testing code 
Fix FindBugs issues in this class 
When person details change update the UI 
fix grace time calculation . 
Released 0 . 3 . 4 to update the database 
increase sample linking distance so things are not left unlinked now that we look for nodes not edges . 
Don ' t send error in ReadyForQueryListener 
Made Location . clone ( ) public . 
fixed possible problem with closed DB 
Fixed failing integration tests 
Updated test for LINEAR technique 
do not log runtimeexception 
Expose field 
also register token set contributor manually 
 remove txMap put line 
resolved conflicts for merge of fb2e3c8d to master 
Prevented resetting the delay from throwing an exception when running in a war 
ignore long time test 
Fix PGraphicsOpenGL . surface field not getting initialized 
Add finish ( ) after timeout of Reqeust Arc operations . 
Set AWT as headless when ZAP is in a headless mode 
Fix build break due to misuse of " git add - i " command 
Don ' t strip NativeRunnable constructor . 
Help id corrected . 
Fix copy & paste error in isKeyguardLocked ( ) 
Fix checkstyle 
Fix copy & paste error in isKeyguardLocked ( ) 
Added serialVersionUID to MongoInterruptedException 
Remove rotate ( angle , x , y , z ) from reference 
Prevent TextureView from ever setting a null layer paint 
Remove checkThread ( ) from findAddress 
Remove unneeded AutoClosable interface from PublicationImage . 
Fix quality flaw 
LPS - 18364 AssetRenderer fails when embbeded in custom portlet due to incorrect class loader 
Started new demo . 
calling setText ( null ) on a TextView should actually set the text to be empty string ( this is what the real android library call does ) 
removed @ author tag from JSONPointerException 
update JmeSystem version number 
add gc ( ) 
Fix returning wrong field 
Make version final . 
Fix executor propagation in CallOptions . 
Remove unnecessary import 
Fix the comment 
disable broken inspection by default 
Use the resolved Context in ContentResolver . 
fixed a bug causing drawable bounds being invalid after changing the image 
Remove unnecessary initialization 
Remove stray import . 
IDEA - 126585 " Evaluate Code Fragment " dialog uses some strange proportional font in editor 
Make MetricsRegistry # getMetrics ( ) return an unmodifiable map 
Removed unnecessary return statement in LineageFileOutStream 
Add missing ap threshold config for hotlists 
removed @ Override from interface method 
corrected PImage . setModified ( ) so mx2 and my2 are width - 1 and height - 1 , 
Ignore NeuronsTest ( pure benchmark ) . 
Removed @ author tag . 
Fixing null values in first domain trust array entry 
Make InstallCommand ' s constructor public 
Add postSync so that the chrome stack has access . 
Missing close cursor call 
Remove unused local variable 
Copy opaque over shape in GradientDrawable copy constructor 
Fix bug # 70 . 
remove empty line 
Fixed mcp mapping . 
don ' t escape HTML twice 
Remove constant TAG as it is not used . 
Remove unused import 
LPS - 30392 Users do not have access to a site ' s private pages while on permissions algoritm 1 or 2 
remove dead code in Downloader 
Removed extra Whitespace in UrlMappingUtils 
Removed extra close ( ) method that threw errors 
optimize imports 
Fix miscalculation of grid section bottom most edge . 
Fixing construction of handler in AppWidgetHost 
Remove redundant check . 
LPS - 53447 let the Group cleanup everything 
Fix nullptr exception . 
fixed updater tests . 
added System . exit ( 0 ) to exit main method on completion 
Fix crash at boot . 
Fix typo in Javadoc 
completion invoked in empty autopopup phase = second 
Populate TwoDimTable for CM in constructor . 
When we connect to vold , explicitly mount external storage . 
Removing author information from AuthErrorDialogFragment . java . 
removed comment 
Fix FindBugs niggle 
Fix test in eventsArePair ( ) . 
Remove debug statement 
remove debug output 
Fixed a bug with how GCM service is constructed 
Remove useless TODO . 
removing unused var 
add @ since 
don ' t throw in Orchid sockets when attempting to set socket options , just ignore the request instead 
Change quartz2 endpoint to be a singleton 
fixed parameter name in default implementation of the 
Disabling still broken test . 
Remove extra blank line 
Remove a call which seems to serve no purpose and sometimes causes exceptions 
Fix an issue 
Remove nfc 
debug printing 
Made MongoException unchecked 
Terminate instanceInfoReplicator with shutdownNow ( ) instead of shutdown ( ) 
Added SubsequenceCounter class 
LPS - 44342 Make class private 
fix conflicting native library error message 
correcting typo causing build failure 
Allow null string input 
Removed the exprRest from the NOT with parens since it should not expr the rest 
Added test case to K2JvmCliTest . 
Remove extra newline 
Recycle original screenshot after rotation . 
Fixed an issue where the tx log wasn ' t closed properly , leaving transactions not marked as finished . 
Fixed license 
Removed unused import from AnimatorSet . 
Skips adding a listener if already exists . 
Removed leftover name field 
HeadlessMaterial doesn ' t correctly set material data field 
renaming a testfile 
Remove comment on private serialization constant 
Fix - - filter documentation 
Return the empty string 
Fix loading theme color for non first webview load 
added code to visit sibling nodes 
added missing network update call after removing blueprint 
Dialog should update status if Apply is pressed 
Reload the EndNowButton label 
fixed ArraySeq . count 
Don ' t recycle accessibility event after sending . 
Remove fall through for KEYCODE_VOICE_ASSIST 
Remove tracking of all drawables in ViewOverlay . clear ( ) 
Avoid NPE in GridSearch . 
throw exception if via count is uninitialized 
Removed broken link to non - existent method . 
revert change preventing NULL SSID in a WifiConfiguration 
Remove ' Support ' from settings name . 
Tweak formatting in Android template 
add noinspection simplifiable for more readable in BaseDownloadTask 
LPS - 56566 Fix PropsKeys 
Add missing @ param javadoc 
Ignoring failing test 
Set daemon flag on poller threads . 
Don ' t allow resize of param dialog . 
LPS - 54076 Use SaxReader again since SaxReaderUtil doesn ' t have a read method 
Remove extra newlines 
Fixed # 202 
Stops ' late provide ' errors in ES6 circular imports . 
Add method that already existed on DefaultExecHandle that exposes the process state on the corresponding interface . 
Remove some debug code 
Add COCOA_TREE to list of possible tree types . 
fix a copy paste misprint 
Prevent double wrapping directories in MockDirectoryWrapper 
Remove debug output 
tear down the custom injector when done 
Set time when creating a new location 
Ensure item loading threads have ' background ' priority 
Don ' t initialize JMF 
make class non - public 
Remove unused imports from webapps 
Add deprecation warning to parser API 
Fixed nullability assertion that was accidentally made too strong 
update installed plugin version after filtering ( IDEADEV - 20263 ) 
Don ' t show progress bar on Image Viewer for now 
Dismiss system windows when search is launched . 
CB - 8764 Save instanceState before calling super 
fix author filtering in SVN browse changes ( IDEADEV - 5990 ) 
Don ' t loop through extra prefixes when inflating prefs 
Omit JNA + AWT load test on headless systems 
Make MarkupBuilder . getMkp ( ) return MarkupBuilderHelper instead of Object 
Revert " Remove whitespace " 
Remove templates field 
Deprecating ExternalResources . 
Deprecate CommandFailureException . getCommandResult 
Fix type 
Made QuasarURLClassLoaderHelper final 
Don ' t log message for undefined EXIF rotation 
Remove a debug line 
added deprecated annotation to deprecated methods . 
Added # toString ( ) . 
Fix indent 
Added SQLDialect 
added TODO 
IDEA - 43728 Provide a way to step in a chosen thread while others remain suspended - remove dupliacted SUSPEND_ALL contexts 
Remove old comment 
Remove redundant import 
The emojicon size was not consistently taking effect when it was set after the text was set . 
Fix setting of title in GraphView constructor 
Revert default behavior of " Back Key " to exiting application . 
Added John " tug " Wilson in the @ author tag of the javadoc 
LPS - 68920 Let ' s return a different list to prevent adding elements to the real routes 
Suppress warning . 
Fix warning 
Prevent possible duplicate deregistering 
Found the corresponding Unity class 
Try breakout threshold 10m 
Don ' t load AST in toString 
add missing import 
Turn off EXPANDED_ACTIVITY_DEBUG 
Remove unused import in BufferUtils 
ensure key provider returns unique key for each item 
Do not advance mLastEventTime when enabling or disabling user activity . 
Fix # 1862 
Removed an infinite recursive loop in Log4JLogger . error ( String , Throwable ) 
Gracefully handle apps without native libraries . 
Missed import 
made final 
bumped up test timeouts since Hudson seems slower than local machine for contention experiments . 
LPS - 43621 Delete group configurations before the group gets deleted 
File consumer should use exception handler to handle all component specific exceptions . 
Added comment . 
Fixed a bug where subtasks data could become corrupt after migration 
IndexRangesMigrationPeriodical should use a daemon thread 
Changed the description for the Quit app . 
Add missing line 
added file referesh before showing merge dialog 
Allow the global naming context to be reset . 
Removed unused DB reference in DBObjectCodec 
only show interlineWithPreviousLeg where true 
Fixing a potential NPE in AsyncOperationStatus . 
Delay camera autofocus till surfaceChanged callback 
fix travis - ci build error 
Fix reentrancy bug in ServerImpl during shutdown 
correctly handle several class filters remove 
Remove obsolete comment . 
added InputStreamReader closing 
Fix build due to added API 
Add support for interceptorsgd 
Fixed forgotten delegation 
removed purge - on - auth behaviour 
Increase SchedulingPolicyService . PRIORITY_MAX to 3 
Changed openID filter to use its owen ordering value as it may be used together with form login . 
Fix bug introduced in Change I856118d8 . 
Prevent unnecessary clearing of cache by not doing it when a PortetPreference is created . 
check restricted for file name instead of method name 
Removed test seed . 
Integrating removal of FocusTrackback for Linux since it brings more troubles than fixes . 
Activity share has no text input 
Removed @ PrivateApi annotation ; not needed since PacketTransceiver is in the impl package , and therefor should not be accessed by the outside world 
Fix typo . 
Fix DrawerLayout to ignore non - drawers in drag operations . 
Hack Jetty / Websocket Session 
set current thread 
Fixes a bug when layouts are changed since the 
Fix label drawing on screenshot . 
Adds static final TYPE_CANCEL 
Adding missing default return 
Tell IDEA to shutup about static access to instances 
Fix build 
reset version string in SdkModificator only if real changes in roots were detected 
Make nodeidx public . 
ReadonlyStatusHandler should show a confirmation dialog by default . 
use primitive type int instead of Integer 
Fix max stacksize on EnderPearls . 
fixed null pointer exception in PShader 
Invalidate structure when adapter is changed 
Shut down thrift on decommission . 
Add mobile Email type . 
Looping playing music 
Removed useless and illegal json object in the response . 
Fix double forge init on server 
Fix accidental conversion of copyright from Atlassian - > mongodb in a 
Updated version 
Fix infinite loop . 
adjust the MessageHistory to the new LocalUserChatRoomPresenceChangeEvent 
added accuracy checking to native accel implementation , this way getCurrentAcceleration returns fairly accurate results 
Fix NPE . 
wake - up sleeping reader when stop is called 
Added getter for FloatTextureData . buffer 
Remove unnecessary viewType assignment in LayoutParams 
Change Chunk < T > to be a static inner class 
Set default wait strategy back to BLOCKING . 
Fixing the synth function so that queue processing continues . 
don ' t highlight unassigned vars in boolean checks by default 
fixing minor rounding bug in Helper 
added fabs to ufuncs 
Remove superfluous assignment 
Maybe I undo this so I can merge a pull request automatically . . . 
Properly handle empty layout in getFirstVisiblePosition ( ) 
LPS - 34194 Remove unthrown exception 
Removed public from WebElementCreator 
LPS - 46156 Remove early escaping 
Remove spaces . 
Improve javadoc in BlockDoesNotExistException 
removed OBE comment 
Fix ambiguity due to null - compilation error 
Fix RecoveryManagerTruncateTest failing in test - compression 
responseContent to protected so something that extends can see it 
Remove not - needed call of ByteBuffer . clear ( ) . 
Don ' t update TextureView ' s surface if the Layer doesn ' t exist 
Fix loosing default profile after change 
Fix checkstyle 
Remove unused local variable 
Invalidate ActionMode content rect on scroll . 
remove undefined methodcall in AfterClass 
Updated ConsistencyCheck . java for new feature 
Deprecated com . mongodb . MongoServerSelectionException class 
Return an empty string if email is null . 
add comment 
fix a bug in commonutil . 
remove assertion 
Fixed Javadocs in LocalSession . 
conversation settings fix # 368 
Call super . onCreate ( ) 
Fix Internal . inMilliseconds ( ) where the offset was a byte instead 
Fix reading sleep policy 
update HttpUtils 
Make APNS . java final 
Increased max number of items rendered from 3 to 5 . 
remove parentKey cruft 
removed unused import 
Add DIRECTORY_SEPARATOR constant 
KeyDispatcher always has a non - null KeyChanger 
remove ugly focus highlight border 
may as well make this by default 
help ID ( PY - 4108 ) 
Check mNativeClass ! 
Fix checkstyle violation - extra import . 
Added simple attributes to the Item . 
Also update index ranges after retention cleaning 
Image # setAlign should call invalidate . 
Fix LabelAdjust , set false to setConverged at init . 
change default request connection timeout to 3 secs 
Correctly reset fragmentedOpCode on WS frame completion ( @ daviesian ) 
Fix a bug where the lazy - initialized ActionBar object was being too lazy . 
LPS - 30109 Remove usage of deprecated API 
Turn off screenshot capturing for thumbnails . 
Fixed checkstyle errors 
return a blank plugin context path if it is null 
Remove an unused import . 
encode http params 
Fix a crash . 
StripedExecutor should interrupt worker threads during shutdown . 
Clear last paused activity . 
Do not load gnustl in NativeMemoryChunk 
JsTestDriver run configuration ' s layout 
Fix routing 
Move App . java to correct Package # 324 
Fixed issue where the " start scan " button would be enabled with no 
Fix the seed for DRF JUnit . 
Also closes the executor containing the connections 
Register the UI Thread as a sensitive thread to the runtime 
Fixes # 208 by returning back to posts list when a local draft is deleted . 
Fix an serializable bug . 
Add missing @ Override . 
Remove call that doesn ' t do anything . 
Fix a trailing whitespace in CompilerExecutor . java 
Deprecated annotation to methods . 
Revert since it breaks a unit test 
Fix memory leak . 
remove import hashmap statement since it ' s not been used . 
Removed an accidental line break to retain the standard code formatting . 
fixed error . 
Don ' t check items on selected GridView 
added TRACE_TAG_REACT_APPS constants 
reset picture orientation per issue # 126 
Added < icon in action bar 
Optimize PooledUnsafeDirectByteBuf . newInternalNioBuffer ( ) 
Very stupid coding mistake . 
Fixes issue 732 
Drop all inners classes if sorting is needed 
context Help mapping . 
Reduce visibility . 
Removed unused import 
setting right builder 
Don ' t call onAttach twice on v4 fragments 
Fixed last fix 
Remove unused class import 
Fix compiler warnings for unused imports 
Fix checkstyle 
Set CursorWindow native pointer to null rather than 0 when disposing 
Expose correct version message . 
Remove defunct flag 
Fix typo from javadoc update in r1712993 
Hiding DrawerLayout does not fire correct accessibility event . 
Fix toString ( ) of Resources . asByteSource to match method name . 
Reduced too broad catch block 
fixing # 184 
Recycle the comet flag ( pretty large glitch . . . ) . 
set feedfiletype in DownloadStatus contructor 
Missing import from pr # 283 . 
Harmonize , null the SSL engine as well . 
Remove empty line between javadoc and type 
LPS - 26283 Add a line break 
fixed NPE for # 1513 
Undo astrid lite constant 
Add serialVersionUID to NotSupportedException 
added TODO about malfunctioning of client port 
Do not configure Undertow listeners as reversed with the reverse proxy 
Change the default compilation database format to clang . 
Fix buffer leak in OutputChannel 
Fix annotation of getBehavior 
Fix ClipboardManager # hasText 
Fix RLock ' s entries 
removed author tag 
FlowManager should set mDatabaseHolder to null on destroy # 251 
changed hardcoded group 
Replicate text and sounds settings for managed profile . 
Fixing failing tests . 
Fixed delete mapping to return acknowledged false when ack times out 
Clear last paused activity . 
Make the test pass 
Add transport route 
add CamelHttpBaseUri header constant to Exchange . java 
Fix bug 5121406 - ActionBar . setLogo 
Fix docs 
add blockoutstream in blockinstream 
Fixed blog display to show ( No Blog Title ) if the blog has an empty title . 
reverted content - dependent flag 
Fix unused import 
Removed debug stacktrace in quarry arm . 
help ID ( PY - 4110 ) 
Fix quality flaws 
keep deprecated requestFBOLayer ( ) method for now . 
Fix copy / paste error 
Fix JavaDoc . 
enable antialiasing in todo view ( IDEADEV - 22461 ) 
Add a test to verify that Hit . equals ( Object ) works 
Remove unused variable 
Put the marker on the server ML file too 
Make force protected for sub - class access 
enable GL rendering of launch background 
Make View # setBackgroundDrawable a no - op if setting the same background . 
remove a space 
restore the drawer state whether it is open or closed 
Fixed bogus assignment ( assigned parameter instead of member ) 
closure states have empty stack initially 
Make WebHistoryItem constructor public and hidden 
Fix dark text appearance by using the correct resource identifier 
don ' t clear disk cache on finish 
Fix indent 
LPS - 53821 Fix DS PortletKey in Portal 
Set node size to 10 in NodePencil . 
Add battery capacity property 
replace Future < T > with T in EJB implementation 
Remove unused import 
Added a ms tag to the debug time system out 
Add TestsuiteSanityTestCase to check testsuite environment . 
Add a TODO 
Add logging for unknown state . 
Fixed typo for NETHER_WARTS 
Fix recent regression in DrawableContainer . 
Add unsubscribe to AbstractViewModel . 
change autosave interval to 5 seconds 
Added John " tug " Wilson in the @ author tag of the javadoc 
Made BSONReader . State to be public 
Rogue line number for try / catch statement confuses IDE debuggers 
Execute migrations . 
Added Bucket volume constant to Liquid Man 
Use the correct message key 
shiftreduce parser in corenlp requires pos 
LPS - 35241 add the class that can be displayed in the UI to the references 
Ignored failing test 
Remove unused field 
removed unnecessary blank line 
Adds a synchronization point in order to wait for the Jingle node discovery 
make AccountTestSuite abstract 
Skip auth setup if AllowAllAuthenticator is used 
Initialize mShowWhen to true 
update tree ui to avoid problems with cached background ( BasicTreeUI sets bg to trees ) 
Make the Maps / Multimaps Iterator / Iterable accepting overloads package - private ( MOE public ) . 
Fix a compilation error 
Fixing failed tests 
SingleInspectionProfilePanel added updater on scope added from chooser 
Revert " Update HelloWorldEclipse / src / com / googlecode / androidannotations / helloworldeclipse / MyListActivity . java " 
Fix scrolling in completion lists etc . 
Remove violation 
Changing usage of carrier name field of SubInfoRecord 
validate the topology 
icon / > tag generates HTML id containing dot when its message contains it ( prevents url to be opened in dialog 
fixes file date 
Updating Tomcat ' s copy of BCEL as far as r1748500 ( more to come ) 
Remove spurrious line clamping speed to average . 
Ignore intDef on pull from defaults . 
Fix build 
Fixed bug that gradle continued after printing out help message . 
fix test ? ! 
Fix NPE in IInputMethodSessionWrapper . executeMessage 
Add average current property 
Fix Findbugs nag 
missing import 
Include roaming in NetworkIdentity . hashCode ( ) . 
Fix whitespace for querydsl - scala 
removed unnecessary copy of database 
Optimize imports . 
Try and handle " death on startup " a bit cleaner 
Removing console spam 
Fix master build 
remove javadoc warning 
Fix broken Grails debug . 
Fixed deserialization problem in DatePicker . 
Fixed misc problems caused by the renaming / move of BSON classes . 
adressing review comment for # TACHYON - 1243 
Fixing memory leak related to TouchFocus and pooling . 
Fix javadoc of setHandleMethods 
Add a line to separate tachyon . 
Not needed import 
Parameterized testing 
rename section incorrect input checking deleted ( IDEA - 152896 ) 
Theme Preview WebView needs js enabled 
add throws notice for isPlaying 
Fix typo 
Remove unused import 
At least temporarily fix catastrophic failure on screen rotation by basically restarting the whole app . 
removed log output 
scripting changes 
Fixed RedissonConcurrentMapTest 
resize renderer 
added TODO comment 
Use the method provided for changing state . 
Project thumbnail should have the same aspect ratio 
Delete temp zip file once it is unzipped 
Removed testing code 
remove useless println 
fix a minor bug 
Remove invalid assertion ( by abreslav ) 
Allow access to JSError node 
Initialized ImportingJob . lastTouched 
Removes a mistakenly committed System . out . println ( ) 
Fix battery state information propagation in Lock Screen 
Fixed public test 
Parser now uses new colvalue instea value . 
LPS - 53113 add @ Deprecated 
Fixed bug of disappeared rounded angles after first display 
Implemented new constructor in EmbeddedNeo . 
Do not call processDrmInfo if acquireDrmInfo returns null 
Prevent new ripples when max reached 
remove change from another PR to avoid confusion 
FastArray doesn ' t overwrite toString ( ) method 
Make final 
Fix more type info caching bugs . 
Turn off screenshot capturing for thumbnails . 
Remove leftover logging 
Remove whitespace 
Fix MockBlock compile 
Remove deprecated comment . 
throw exception on remove since it ' s not supported ( IDEA - CR - 3123 ) 
Fix pages overlapping in Stack transition effect . 
update branch info after push , because new remote branch may be created 
make addPropertyDirect ( ) non - final so that subclass can override . 
Close the message logger so that the file is closed on windows 
Fix compiler warning 
Added getSelectedItem to the ShadowAdpaterView base class for Android ' s Spinner class . 
Returns the correct elevation in GnssStatus 
Fix infinite loop . 
fixing unused import 
Fix a bug in ControllerActivityCounter 
fixed day / night switch 
Remove creation of synthetic accessor method . 
Addressing review comments . 
if null , check version . 
Added a TODO 
Made config parameter " sdk " not @ required , so that standalone goals can be run from commandline . 
Not reinitializing the backing arrays for matrices and lights . 
Removed unneeded import . 
Using ObjectId constructor instead of massageToObjectId factory method 
LPS - 35256 Fix broken test 
Add missed initializer for setter 
Remove extra newline 
Don ' t use the application context to start the Accounts activity ( because then we ' d have to create a new task ) 
Adding extra line 
Ooops , really correct the spelling of pool now . 
Initialize visible to false to reflect the real visibility state 
Add default propagation back to Explode . 
Implemented getOpacity 
Fix API typo 
getCurrentTime always return 0 if preparing is not finish 
really refresh bikeshare stations in service 
Renamed commands in DB . java ( merge fail ) 
Add NEAR QueryOperator 
we could be leaking file descriptors here 
Fix issue with clearing the map of native objects without clearing the ReferenceQueue . 
Fixed a potential CPU cache issue . 
removed redundant annotation 
Fix warning on TwoWayView ' s SavedState 
Resolving a field naming conflict caused by the table join . 
Have the final setVisibility cause a requestLayout . 
no argument constructor , adjust Javadoc 
LPS - 8479 StringServletResponse should reset the inner writer 
remove System . out . println from FakeBase64 
remove uuid 
Fix a typo causing compilation problem . 
Fix build - remove obsolete import of Animatable 
removed empty statement 
avoid use of a temp variable 
added TODO 
Removed unnecessary cast . 
Fix tests returning correct text range from pre - format processor . 
Raised maximum size of GELF messages to 8192 byte 
should this test still exist ? ? ? 
Placed all the field variables on their own lines for consistency 
make memory clear intent obvious 
Fix support for transfering folders and playlists . 
fix constructor access warning 
Add server info 
fix duplicate resetDeltaRequest ( ) call . 
Fix checkstyle again 
Fixing up the standalone activity 
Fix build . 
Removed unused import 
Make ' buck project ' not process annotations by default . 
cleaning all content 
Turn off HSM debugging in DataConnection , to verbose . 
LPS - 57681 are we upgrading components , or bundles ? 
Clarify documentation for ' getN ' on WriteResult as to its actual meaning 
set animation to null when clear animation 
Add link to documentation about the Polymer pass . 
remove myname accidentally included in one of the files 
Improved TableRef # isRoot ( ) 
fixed finbugs issue 
allow longer submitter notes 
custom tag ' noinspection ' cause build problems during release 
Fixed bug in Music when stop ( ) is called . 
Fix doc typo . 
Improved method to select value programatically - now it also will call chart listener . 
allow override of calculated size 
Remove unused field from CompilerConfig 
made class final ( optimization hint ) 
Removed obsolete empty line . 
remove unused import 
Remove MortarContextWrapper from the public API 
Remove the callAllGets ' feature ' of CombinedFuture . 
Removed commented line . 
revert changes to RetryQueryRunnerConfig 
apparently firebird does not support ddl in transactions 
Reload TLM in subtasks tag view refresh 
Delete obsolete import 
Fix collapsible action views . 
Cancel any running bottomsheet animation when the view is detached 
Assign newly created stream to field instead of leaking it 
Fix transport layer rotation bug 
do not return invalid files 
Fix CTS test . 
Fix typo which cause stack overflow if children ( ) was called 
Fixed testConcurrentOnNextFailsValidation 
Add NPE protection 
plugin does not save book encoding 
Remove some duplicated code in DocumentsUI . 
Permit cc - > objc deps . 
correctly handle keyword parameters when building index for foreign key fields ( PY - 5518 ) 
Fixed missing closing bracket 
Fix fairness 
added TODO 
Remove unused import 
revert change on whereCond name 
remove warning 
Fix ConcurrentModificationException in SyncManager 
remove @ Experimental annotation now that this ( = v2 API ) has been online for more than a month 
hide the newly created DatabaseObjectNotClosedException class from sdk 
Fix NullPointerException in AppleTest 
don ' t render HTML in label property renderer ( IDEADEV - 11341 ) 
Reset reverse state when an animator ends 
Not getting gl context on reshape . 
Added throwSubscriberException ( true ) 
Fixed a compile error . 
delayed commit bug fix 
Remove unused mRuimFileHandler reference from CDMAPhone 
Add an empty line 
PY - 11948 Run manage . py Task ignores environment variables defined for Django Console ( and Python Console ) 
git test run by Chee 
Removing random new line 
LPS - 50321 missing @ override 
Give watch Home app location permissions by default 
fixed generic signature issues for field types 
remove false TODO 
Adding replication client shutdown in PeerEurekaNode 
IDEA - 85912 Add mnemonic for Push button in the Git Push dialog . 
LPS - 63724 Add new remote export exception type 
Fixed MersenneRandom naming 
change result type to long ( copy & paste error ) 
change help topic ( IDEADEV - 26215 ) 
Removed TODO comment . 
TraversalRequirements now uses canTraverse 
Fix bug of not setting the paint when we change the footer line height . 
Set phone account in IMS Conference object 
remove log messages 
Fix AudioFormat getBytesPerSample to recognize float 
Remove unneeded " static " qualifier in QuadTree . Item interface ( thanks Cyril ) 
Log more frame data when profiling GL apps 
Normalize line endings 
fix a minior append bug 
removed TODO 
LPS - 63269 apply patch 
Fix a comment to fix the build . 
Fix test data , restore incorrectly deleted import 
Turn off debug in CellInfoLte . 
fixed wrong import . 
Fixed bug with local index not showing after switching tabs 
Add @ since comment for method Part . getSubmittedFileName ( ) that was added in Servlet 3 . 1 . 
set version 
rename " Console Folding " to " Console " 
do not include metrics name twice # 210 
Tell IDEA to shutup about static access to instances 
added helper method for builder implementations 
UNDERTOW - 401 request scheme attribute returns the wrong thing 
Fix base64 char map . 
fix terminate default state 
Fixed useless logging . 
Revert " Make sure . 
Fixed bug with BlockFlow . equals 
Fix tests for a pure Ant run 
fixed test data for duplocator test 
LPS - 48469 add contextName to the interface 
set raptordata on added trip patterns . 
fixed misnamed setter 
Fix # 1435 and # 1436 by reverting 7f7bf304b0b43a1445e68c15ee6f6403c7ca5b9e 
Revert I3fdda2588a7c612d7c9cfb4f25d9aedd1d609162 which open two functions 
Delete dangling comment about long - dead code . 
Fix spelling 
add UNDEFINED to byte encode JAVA - 54 
Leaking navbar item ' s cache on project close 
fixed setScale ( Vector3 scale ) 
Change visibility . 
handle calendars with an access level of " root " 
Synchronize access to getMaxSize . 
Fixed IndexOutOfBoundsException in EpisodesFragment 
The new task system didn ' t create the render targets . 
Corrected Javadoc on MapReduceOutput 
Remove print 
Fix build . 
Fix doc bug 
Add an ensureOpen check to Publication . hasBeenConnected ( ) . 
add super . addToCollector into AndroidPrebuiltAar # addToCollector 
fixed max size of library slots , close # 1710 
LPS - 43227 Set filter search to true in Blog 
Changed playback service to not sticky 
ensure cursor is visible after execution point advances 
Handle throttling being disabled via policy change 
fixed reloading TestModuleProperties after reopening ( IDEA - 150835 ) 
Remove MWE - specific class members 
Revert " Revert " Ask on demand for automatically set dangerous methods " 
Make the cumulation field in ByteToMessageDecoder package private to hide it 
fix flaky blob RecoveryTests 
set visible pack to empty in vcs log ui in dispose IDEA - 120539 
keyboard shortcuts support 
Fixed spelling . 
enable " serializable class with no UID " by default 
Add " MMS " to common phone number types . 
ClearScrollRequest should set a type parameter 
Fix left over System . out . println in Annotation . java 
fixed door schematic saving , for # 1962 
add offset 
Remove static hooking of clipboard manager again 
Fix refresh folder name in action bar title 
Fix bug in limit in From class 
Lower Display Bitmap Size 
Remove double up unregistering mPackageBroadcastReceiver 
Fix ON / OFF option update error 
Added JUNGLE tree to TreeType enum - this fixes BUKKIT - 886 
Don ' t re - throw exception in onThrowable 
Fix leakage 
Remove obsolete import 
Fix CalendarView to show the month title properly . 
Fix ApplicationInfo copy ctor 
Added consistency check tool . 
Fix unexpected rotation change when re - enabling auto - rotate 
help topic ( PY - 3290 ) 
Add status code javadoc . 
Removing unused imports . 
add the return for the save ( ) method in PDF 
add comment 
Do not restrict alpha on selected color for underline . 
To call TypedArray . recycle ( ) when we are done with the array . 
RandomAccessSparseVector addTo made a inner static class 
Removed new lines 
Fix checkstyle 
Added encoded method for FakeContext . 
Fix null top view crash 
compile warrings fixed 
LPS - 54590 Add a line break to show order matters ? 
remove javadoc warning 
Optimized searchFor ( ) 
Fix action bar items missing when opening new message . 
remove final 
Fixed formatting of data structure test code 
help ID ( PY - 4112 ) 
Remove wrong comment 
Remove the callAllGets ' feature ' of CombinedFuture . 
Remove a print statement that I accidentally left in a test . 
IDEA - 130338 Please restore previous mapIds for topics in Settings / Preferences dialog 
Avoid compiler warnings 
Remove unused var 
Clarify usage of StateManagerExceptionHandler . error field with a comment 
adding CMYK constant for future expansion 
Very stupid coding mistake . 
remove unneeded line 
add javadoc 
remove component annotation 
Fixed the filter decrement count bug in subtasks mode 
Fix sendNotifications called twice 
NestedScrollView should call super . onAttachedToWindow ( ) 
revert debugging change 
Changed order of init in SmackAndroid ( ) 
CAMEL - 7209 Fixed the unit test failure of XmlConverterTest 
removed unnecessary import 
volatile should ensure double locking to work properly 
added copying to JSONPointer constructor 
Remove unnecessary imports 
Invalidate the cached ripple drawable mask if mask layer changes 
Rename File ( same name ) - Error and Hangs 
Fix NPE bug 
Removed ItemStack import 
LPS - 8772 Missed one line , caused ETagFilter not working correctly 
added a call to super . setSpatial in setSpatial 
remove unused import statement 
switch back the divider to true so the behavior keeps the same for people 
Remove unneeded import . 
Remove unnused variable . 
Prevent receiver leak in TrustAgentWrapper 
Avoid Profile . getTimeZone ( ) NullPointerException 
Updated imports . 
Fixed import error 
reformat code confirmation 
revert change preventing NULL SSID in a WifiConfiguration 
Remove unnecessary dependency of AppCompat library . 
Fixed # 1706 
Fix minor eclipse compile warning 
Fix build . 
Fix javadoc for CameraManager . AvailabilityCallback 
Updated version 
Removed unused import . 
do not leak menu - > root_panel - > . 
add missing @ since annotation 
Fix SlicedMapImpl # clear 
added TODO 
Fix indent 
Remove UserID when logout 
don ' t force reload of IDE for project options 
DSL Platform minified json codec name change . 
Fixed filterByNodesConstantSet in LocalProperties 
set default version if one is not set 
Fix the message decoder to ignore reserved flags 
Set the padding on the content of the sliding activity to zero if you disable the header . 
Fix output stream to not use the converter in the buffer , but do a simple hard coded conversion . 
CORE - 1216 generateChangeLog pulls data with schema by default 
use the same stop 
Make a field final . 
Allow animation styles to be applied to popup windows . 
FastArray doesn ' t overwrite toString ( ) method 
do not show duplicate containing file when navigation element is a file itself 
Fix syntax error 
Change IndexPrimaryShardNotAllocatedException from 409 ( RestStatus . CONFLICT ) to 500 ( RestStatus . INTERNAL_SERVER_ERROR ) 
Remove unused import . 
NewPropertyAction checks empty property keys 
Change access modifier for onRestoreInstanceState 
added TODO 
Recalculate orientation in getOrientation ( ) 
Fix MappedRecordCursor bug 
Suspend must freeze the time 
Remove unused import from a sun package . 
Rogue line number for method declarations confuses IDE debuggers 
Incorporated PR comment 
temporarily disable incomplete compilation infrastructure based on tools - r8 
Flip EMERGENCY_ASSISTANCE_ENABLED to true 
Implemented new constructor in EmbeddedNeo . 
remove bracket . 
added TODOs 
Tell the user about a failed delivery the first ( any ) time it fails 
Added a TODO 
remove context from argument 
scroll pane resets border on l & f 
fixed missing method 
Fix typo 
Fix SSLCertificateSocketFactory . getDefaultCipherSuites . 
added clearing of named continue labels after the map is no longer needed 
Revert accidental class name change 
Remove unnecessary Javadoc 
Fix full inv item bounce client animation 
Fixed flickering in the preview pane in refactoring preview 
Remove hard coded test 
Add final modifier to ShortcutBadger class to avoid anybody to extend it 
Make LineageFileSystem final 
denis fixed it . . . fred wants 1280 
Add @ Override annotation 
LPS - 49294 Add comment back 
compare stack frames by method that is invoked , this way we more correctly remember variables expansion state 
Added missing method to geometry3d 
Removed unnecessary tag 
Fix possible double socket close 
Remove potentially misleading exception message 
fixed possible NPE 
fixed PY - 7294 Invalid warning about encodings in Python files 
remove spurious stdout N = , rank = 
Set getDiffableValue ( ) as synchronized in the Note model . 
Remove useless static keyword . 
Reset joda - time to use system clock after test . 
Fixed isDrawing . 
fix # 764 . 
Setting z = 0 in vertex ( x , y ) 
Rogue line number for method declarations confuses IDE debuggers 
Websockets now need this method . 
Don ' t remove all queued items if token = = null 
The JSSE support class contains only generic code that uses a standard SSL session , so it is normally possible to reuse it . 
Align Mockito . after with Mockito . timeout to take a long instead of int 
Align two copies of Clock2 . java 
add help topic ( IDEADEV - 24855 ) 
Implemented new constructor in EmbeddedNeo . 
Fixed NPE and problem in which custom AuthenticationMechanisms aren ' t used 
BIO doesn ' t use comet but align code with NIO / APR . 
Capitalize configurable name 
enable " show in new tab " 
makes params final 
Tweaked order so that forced browse attacks come lower in the right menu list 
TextField ' s cursor doesn ' t blink in GWT backend 
Added private constructor . 
IDEA - 107291 " Unshelve " into a new changelist puts new files into active changelist for HG 
Add the beta annotation to setFastInsertEnabled ( ) 
JsonProvider . creteArray now returns Object . 
Log a warning when a navigation is blocked by the whitelist 
removedunused import 
Add the hide for the inner class definition . 
updated setImage method in BootstrapThumbnail to use invalidate and requestLayout methods as recommended in Android docs 
Fix build after revert 
Fix unread count in notifications ( again ) 
LPS - 52591 Do not set portletToolbar to null 
remove duplicated line 
Remove extra newline 
added TODO 
enable GL rendering of launch background 
Fix the - 1 unread count bug . 
modified example 
Set the block name for lasers 
Fix copy & paste error in isKeyguardLocked ( ) 
Missing acceptAnyCertificate propagation 
Prevents unnecessary exception from GA failure . 
Fix typo . 
Properly stop the file worker session cleaner thread 
initialize module for every created Python run configuration 
calculate hash on adding book 
Fix null in help output 
Removed white spaces 
Remove an extra new line 
update BitmapUtils 
Using proper key for removing from map . 
return actual value of isLocal ( ) in command line args 
initialize default project profile for template project 
LPS - 54984 Fix warning 
Remove debug logging in divider draw 
Fix sync tests failure . 
Removed spurious import of a com . sun class 
remove redundant initialization . 
Ensure only a single scroller animation callback per frame . 
should not allow setting of the world 
Make BlockSuppressalStatus constructor public so that it can be constructed by the provider . 
Added a TODO about merging Python scope - related code 
Removed unnecessary warning logs related with ClientBootstrap 
reset FocusWatcher . myTopComponent to null 
LPS - 33820 PACL - update the FileChecker with modern logic - include the actual root dir 
Don ' t swallow fatal errors in OperatorZipIterable 
pass the long clickable setting to the underlying control 
the new snack bar hide too quick if clear previous snacks . 
removed long col 
Fix extra text appearing after ellipsis 
Make the button always enabled 
IDEA - 133873 refresh changed files after commit , because they can be modified by hooks 
Fix an unintentional change in method signature and avoid an API change . 
removed empty string 
fix the overlay effect problem on Android - L 
Updated schema version to 3 . 2 
Fixing import optimisation on Type caused compilation failure 
Replace log4j reference with Logback . 
remove test code . 
add javadoc 
Fix a constructor of ForegroundLinearLayout 
remove debug usage doubling 
Fix unused parameter warning . 
Fix ant checkstyle 
Correctly reset secure channel before it is re - used . 
removed unused variable 
set log level to all 
add TODO 
Set the cache size to zero when it is cleared 
fixed the redis instance not stopped issue 
Fix build 
Add ` resources ` parameter to ` PythonLibrary ` rules 
Implement GradientDrawable getColorFilter . 
Removed unnecessary indirect call in NioSocketChannel . isConnected ( ) 
add help id 
Making default Socket timeout 20s ( from 8s ) . 
Add a a trailing comma . 
Fix broken performance test . 
The volume key will effect both ring and media vol at the same time . 
Fixed bug in dumper ( compile - server ) . 
Deprecate class that is no longer used . 
Remove unused import 
Fix typo . 
LPS - 36407 Logically break " missing references " and " layout " code 
removed a trailing log 
Fix broken test . 
Add TODO 
comment failing test 
Decreasing default max connections per node to 10 
Fix NotNull exception with com . intellij . psi . impl . source . resolve . reference . ReferenceProvidersRegistry . getManipulator ( ReferenceProvidersRegistry . java ) 
IDEADEV - 41221 fixed case with two rebase processes 
set book progress from XMLSerializer 
CursorToBulkCursorAdapter . close must call mCursor . close instead of mCursor . deactivate . 
ViewPager was not repositioning the PagerTitleStrip properly 
Fix typo in comment 
Fix most of JS back - end tests after adding Pair and Triple 
LPS - 4318 Move it to the deprecated class as well ( just in case ) 
corrected a misuse . 
Made checkedItems public for inspection by tests 
test was using incorrect target directory - noise in source tree 
reset light count in lights ( ) 
Fix GpsLocationProvider to return GpsStatus and Nmea events . 
cancel popup on navigation 
add compaction marker to in - memory list of components . 
Fixed error where negative byte values were read causing the DataInputStream to throw an EOFException . 
Ctrl - Shift - W triggers NPE ( IDEADEV - 15817 ) 
git test run by Chee 
broke the build 
Java regexps do support possessive quantifiers ( IDEA - 81507 ) 
Turn down depth of recursion 
Fix warning 
fixed finbugs issue 
Prevent NPE in HardwareRenderer 
turned off debug 
Fixed ctr must setup the default functions 
Remove dead import 
LPS - 28250 BaseAsyncDestination should shutdown attach ThreadPoolExecutor on close 
Add missing @ CheckForNull on templateKey 
Removed a system . out 
Remove bodyGenerator on resetNonMultipartData 
Fix 143 potential context leak 
Request now generates strict json code . 
Better swap these to make sure we never enter an endless loop 
remove local that was masking the superclass field 
Fix javadoc for CameraManager . AvailabilityCallback 
Fix a Javadoc comment . 
Fix edge label positionning . 
Fix builder issue 
removed jmock dep 
avoid " invalid state " assertion ( IDEADEV - 21852 ) 
Fix EmptyLineSeparator violations for classes , issue # 1040 
Added TODO 
add getCount method to BytesInputStream ( @ MysteryMachine ) 
Improved assertion messages in failing ReplicatedMapTest tests 
remove unneeded TODO 
IDEA - 66561 ( ' Surround with . . . ' in GSP could suggest if / else / each tags ) 
add a method to get the recipe . 
Fixed onTouch in ScrollView or ViewPager 
added isDrawing ( ) 
remove double setting clear 
Check usage Object . wait ( ) in AbstractFailureDetector . 
add missing redirect after restoring user in new session 
Added public method to Cache to check initialized state 
Add todo for investigating system property clearing 
Add getOnFocusChangeListener to View 
Make an internal class package private ( cherry - pick to master to unblock all ) 
Fixed missing import 
Ignore DLGradientCheck for now . 
Make sure . 
added clearing of named continue labels after the map is no longer needed 
Add getContextPath . 
add TODO 
Added first constants 
fixed typo 
Remove TODO comment 
Fixed findbugs issues 
Initializing one less var 
Fix incorrect class name in TestTextureArrayCompressed 
Fix typo for setting selection drawable 
Fix nit on length of flag constant . 
Reverts removal of @ JsonIgnore on Event . type field 
LPS - 36595 LPS - 37303 Undo SF in c034e424db7a18a4de11f2ec3c2bde00c4ee9b56 , because I think he was trying to show declare and set membershipRestriction in its own block . 
help topics for VCS configurables ( IDEADEV - 33672 ) 
Exported version 0 . 8 . 1 
add helpID 
triggering the build . . . 
Fix SeekableViewsForTest to handle the reset ( long , double ) overload properly 
Changed thrown exception in Javadoc in ' FileInStreamIntegrationTest ' 
Remove unused local variable 
Fixed the CS error of camel - core 
Fix wrong intent being passed in PhoneWindowManager . 
Fix throws signature 
Fix masking of LockClientStoppedException during OperationFacade . unregisterExecutingQuery 
remove unnecessary import 
simplified dbget . 
LPS - 54662 Do not use a new thread pool 
Fix crash when doing conferencing over Wi - Fi 
Fixed findbugs issue 
Refresh action bar title in FolderList when unread count was calculated 
Add an assert to RowDataResolver # getData ( ) 
don ' t return null network . 
adjusting the DocsGenerator 
Hide field packer . 
Removed dummy code that was breaking the tests . 
bump the version in Version . java 
remove orientation spam 
Removed some necessary javadoc 
Disable one of the ` ExternalJavacIntegrationTest ` test cases . 
Fix config option loading for TitanFactory Builder 
fix create a nearcache object before reading into 
Removed unnecessary import . 
missed return 
stop the session 
Reduce visibility 
The / green command should now only affect dirt on the top layer . 
Whoops fix installing . 
Fix loadUrl ( ) for Snacktory . 
Stops bad behavior 
Add missing invalidation check to drawable cache 
Added default culling implementation to RectangularShape . 
HHH - 6297 remove legacy cache api 
Add mnemonic to " Force checkout / merge " 
Call WebView # freeMemory before collecting memory information 
Avoid needless nullpointers . 
help ID ( PY - 4107 ) 
Add missing mechanism - too - weak SASL Error 
LPS - 66130 Remove old property 
Make TemplateResource public ( to make it reusable from other frameworks ) 
formatting change 
Reset languageMode to languageIn at the beginning of processNewScript ( ) 
Updated value for drag distance 
remove debug line 
Code style settings code refactoring / clean up 
Hide FingerprintManagerCompatApi23 
AccessibilityNodeInfo refresh returns a stale state . 
Fix comments 
Updated TSViterator and created an asrelations processor 
Fix copy - pasted comment . 
revert circular reference in generics 
disposing tree builder 
removed extraneous whitespace from pull request 
Implement PrestoConnection . getTransactionIsolation 
Excel import sometimes drops last row of data . 
Revert " Invalidating a TE should not cause the pipe to drop " 
Fix build 
Now closes ReadableByteChannel after it has been read . 
 @ Deprecated does not have effect in Groovy 
Change the SingleFilePageSwapperFactory implementation name from striped to single , because we might want to stripe over files later 
Added javadoc 
kill subprocess when ShellSpout . die ( ) called 
Add file path to CorruptSSTableException message 
Synchronize isClosed . 
reinstated setting of mContext variable in constructor 
Also use the parent constructor here . 
PartitionManager should commit latest offset before close 
Fixed default focused element for credentials dialog opening ( password is focused if username is disabled ) 
Make SslHandshakeCompletionEvent constructor public 
remove extra pop 
forget regexp in find model ( IDEA - 90278 ) 
LPS - 56932 missed this 
Don ' t lowercase word vectors by default 
Actually store the newly computed deceleration . 
Stop Eclipse complaining 
Return the view even when timing out in waitForView 
LPS - 50178 Fix a presumably copy - paste issue 
Fixed serialization / deserialization . 
Remove unnecessary whitespace 
Fix Xposed not enabled 
Make MarkupBuilder . getMkp ( ) return MarkupBuilderHelper instead of Object 
added missing imports 
Fixed a bug in Color where alpha changes were not applied , when setting using setChanging ( float , float , float , float ) . 
Update the ant example to contain an error 
I inadvertently passed the wrong source in the compile - time refactoring . 
Turn off debug flag 
Wrap the root cause rather than just using the message . 
LPS - 37805 Remove unnecessary call to parent class constructor 
Clicking on the new mail notification gets you to the default folder if any else to the folder list 
Implement size method for vector class . 
Fixed AntennaPod auto - cleanup algorithm 
Return the record state locked 
Add url null check for getting cached file . 
Fixing bug 2502522 - Accessibility events contain text of invisible views 
Bug 4588114 - Make GestureDetector behave nicer with parallel multi - touch detection 
IDEA - 19061 Integrate the Rearranger - plugin into core - IDEA 
corrected a typo from @ Maxwell1987 
Fixed typo . 
Make DayViewFacade not final 
Add java . util . List import . 
Fix bitmap tinting 
reset stanza queue when resetting xmppconnection 
Fix a sentance that was 
Fix View - > Model space for ViewProjectionMatrix 
add toString ( ) 
Fix show call . 
Returning the defaultCatalogName if it is not null . 
Consider scene uninitialized after destroyScene ( ) 
replace path separator characters 
fixed maybeClass when passed Class 
Remove an outdated comment 
changing mx2 / my2 back 
Fix automapping cache update position 
remove spurious import 
improve concurrency 
Call odDataSetChanged ( ) in ListRemoteViewsFactory constructor to guarantee that task list is populated . 
Remove superfluous comment 
revert change preventing NULL SSID in a WifiConfiguration 
Fixed the TitleParserTest to reflect recent updates in behavior 
make predicate package local 
LPS - 52139 make sure to cleanup template managers 
Ignore bad unit test 
LPS - 24280 add comment 
HHH - 6495 Adding a comment and reference to jira issue 
Changed super call to point to correct method . 
Add null check in ViewOverlay 
disable a doc comment 
Added noop unregisterReceiver to complement existing noop registerReceiver . 
Missed import 
Fix issues with app crash 
Fix unit test 
Need at least one public API for javadoc to run during release . 
Fixed an issue with the headless server not saving the world on shutdown . 
Fix typo in log message . 
removed sysout from AnimChannel 
Add a bogus method in otherwise empty test , to prevent build breakage 
Dismiss item dialog when starting playback of downloaded episode 
Revert " Changed power request to activation energy . " 
Reset animation speed to 250 ( 2500 was for local testing and was accidentally committed ) 
Remove unnecessary call . 
remove @ Override from interface method impl 
Removed unecessary bindview call 
Remove unnecessary interface modifiers 
Change IntSetIterator to public 
Remove MWE - specific class members 
Don ' t lowercase word vectors by default 
Fix NPE when using Executor 
Fix AppleBundle # getBuildSteps ( ) so it returns a non - null value . 
Fix Checkstyle / IDE / Gump nags 
Added check for invalid scope 
don ' t force refresh if data is taken from cache 
Fix i18n - unsafe API in AaptStep 
Fix up whitespace 
Optimize it 
Fixed the problem with the calendar sort order using the column name 
Fixed a bug with notes de - linkifying 
cleared cache in travis 
Remove unused import 
Possibly fix # 94 
removed incorrect comment that stated that the return value of addSketches was ignored , when it actually was used in a few places 
Invalidating a TE should not cause the pipe to drop 
fixed wrong test 
Remove extra space . 
PY - 15476 Docker certificates folder field made prefilled with default Docker certificates location 
don ' t pass remote - shell - port parameter twice 
Fix copy / paste error spotted by FindBugs 
Rename method 
HeadlessMaterial doesn ' t correctly set material data field 
removing unused var 
Implement IndexLookupSourceSupplier . destroy 
Fixed a bug where the notifications could overlap when reset 
preferred component set ( roma ) 
Add a missing wifi p2p discovery changed broadcast 
Fix Internal . inMilliseconds ( ) where the offset was a byte instead 
remove change from another PR to avoid confusion 
HS2 ShutdownHookManager holds extra of Driver instance in nested compile 
Remove comment 
Make GetAllResult a static inner class . 
Remove unused discard ( ) method 
Added manual GLProfile shutdown to make sure that no JOGL threads are 
Fixed CCE ( EA - 38206 ) . 
Fix error 
Fix mCoveredFadeColor setter 
Forcing revalidation after entering fullscreen . 
removed unused imports 
implement keyguardGoingAway ( ) fixes build . 
set theme res in a wrapper from constructor 
Notify the EmulatorView of an update after resetting the terminal 
Add column caching to MonochromeBitmapSources and use it to improve Data Matrix speed 
add forgotten method body 
Add back setDivider ( null ) , setDividerHeight ( 0 ) 
remove javadoc warning 
Fix pressed state when long pressing nav bar buttons 
Use the app context to avoid a memory leak . 
Removed redundant call v . done ( ) in ClosureCodegen 
Fix a race condition in ViewDragHelper 
Fix max stacksize on Potions . 
Removed an empty line 
Adding sample code to FAQ for how to retrive a thrown exception send from CamelTemplate 
Adds Throwable - less Exception 
Prints the stack trace as well if there ' s something wrong 
organize imports 
fixed issue with implementation of getFiles in UsageTarget 
Removing println from OperationMerge 
Fix issue in LayoutPanel refresh , with selected builder . 
remove a c / p comment after counter loop / / We never get here but clean 
Correctly set the window callback for ToolbarActionBar 
Added getCurrentTime ( ) to Scheduler 
Remove import of removed view . 
Increasing Enum count to help parse strings upto 65000 
Fixed bug that caused stats to refresh with every resume and fail to restore previous state 
Convert one more bind ( ) - > setVar ( ) . 
Remove ES Client . close ( ) . 
fixed a small bug 
Ninja fix CASSANDRA - 9029 
HHH - 7578 Sybase does not support " unique not null " 
help topic ( IDEADEV - 38121 ) 
updated queryClose 
completing predefined objects properties 
Remove mLastNewIntent as it is not used . 
Use correct private key header byte in reg test mode . 
watch for gif decode OOM 
make Config match yaml ( # 6059 ) 
Changing viewClient to default visibility 
Set missing camera position for particles 
nope , dont need you 
LPS - 45573 add line breaks since I assume order matters 
removed unnecessary else condition 
LPS - 24377 Explicitly set contribution and participation values to 0 when they are not defined in xml 
Added serialVersionUID to MongoInterruptedException 
Don ' t swallow unknown payload in the parser . 
LPS - 47491 Fix compile 
Added a generated serial version to UniqueIndexViolationException 
Run versioncheck periodical with 5 minute initial delay 
Return an empty PluginList instead of null for the 
Implement missing method 
Still return a package suspsended dialog if there is no owner . 
do not repeat java preprocessing as it should be done anyway 
In order to keep sysout clean removed dodgy code 
Fix default implementation of getCanonicalPath ( ) 
Fix typo 
Fixed a bug where the notification scroller could crash . 
Correctly set isText flag for text messages 
update CacheOffHeap . 
set max FUL failed attempts to 5 
Why do I always spot comment typos 2s after I commit a change ? 
Fix grammar error in RxJavaHooks javadocs ( # 4191 ) 
added implementation of withMeta 
Close the file once we are done with it 
Fix warning 
remove " @ Experimental " 
Ninja fix CommitLogStressTest . testRandomSize 
Shorten the animation length to make it snappier . 
removing unused imports 
Delete old image before setting a new one 
I am using the inline editor ( github ) and i forgot a " type = " before info . getTypeName ( ) ; 
Remove log . 
Remove unused imports 
remove uuid 
Removed magic number . 
Move obsolete javadoc 
fix ethernet and wifi can ' t be tuned seperately issue 
Make checkstyle happy 
Updating version string to 3 . 0 
Fixed remove webiew bug 
Updated version 
Fix dark text appearance by using the correct resource identifier 
Remove TODO in TelecomManager . 
Remove multiple calls to recordLeakNonRefCountingOperation ( ) in AdvancedLeakAwareByteBuf . forEachByteDesc 
Add todo 
fixed SocketStoreTest . testVersionedPut 
Slightly increate the drag bezel size . 
Set classification to the same value as the checkpoint . 
not wrap _hintFields into unmodifiable to prevent NPE 
fixed compilation issue 
typo cont ' d ( remove deprecated method in trunk ) 
Added explicit HystrixPlugins . reset ( ) to HystrixTimerThread init of each test 
Include scroll indicators in overflow . 
Adds Intent . FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET to launch fasttrack intent . 
Removed unnecessary javadoc in Tests 
Remove backwards incompatible change introduced by # 210 
made PersistentStructMap non - final again 
Fix build due to @ deprecated tag not having content 
remove a log 
Fix bug with saving intermediate points of the route into GPX file 
fix hide - > quit issue 
Enabled a metric to the BasicOpService 
Fix VoiceInteractionService . isActiveService ( ) . 
Managed bean resolution inside $ { } for JSP 2 . 1 + JSF 1 . 2 ( IDEADEV - 23158 ) 
Add final modifier to AtomicBoolean isStarted . 
Copy the resolver configuration when cloning Bootstrap 
Fix # 1746 ( frequencies all on same line ) . 
DO NOT MERGE Add missing ap threshold config for hotlists 
Fixed incorrect value for ChatColor . BLACK ( was 1 , should be 0 ) 
Fix logic error 
Fix visibility . 
add comment to deprecated tag 
I don ' t really see a justification for doing a blocking write on close . 
Fix touch handling when the drawer is open . 
AccessibilityNodeInfo refresh returns a stale state . 
Don ' t allow onBackPressed to be called while AstridActivity is finishing . 
Reduce the priority of the TTS thread . 
Added some comment ( mostly to test build ) 
HorizontalChangeHandler now correctly resets the X translation . 
Restore missing usage assignment in AudioAttributes 
Prevent TextureView from ever setting a null layer paint 
Removed unused method 
removed unused private field mUID 
Remove destroyed AudioPlayer from list of AudioPlayers 
Branch action has only All option 
Fix compilation error in unit test 
Reset the AtmosphereFactory as well 
Fix build 
Deprecated MockitoJUnitRule 
Eliminates BAD as the column type fallback and instead gives up to chose NUM . 
Changed chat app from fitcDemo to chatServer 
implement setDependencyMet 
Changed number of nodes for unittest to two instead of three to speed tests up 
findbugs add serialversionuid 
Removing Nullable as property is set in creator to non null value . 
UPDATE typo 
expose the highlighter builder Field constructor 
Add a call to Agent . shutdown ( ) at the end of clojure . lang . Compile / main Refs # 124 
Add getBytes to InputStream , URL and File ( patch thanks to jeremi Joslin ) 
LPS - 39388 Remove weird comment 
And fixed diodes 
Fix removeTarget to remove by ID instead of index . 
Ninja fix CASSANDRA - 9029 
Fix bug in ByteBufferSend that lead to incorrect complete ( ) method . 
Eliminate production of useless anonymous inner class by javac . 
Remove tmp files after running tests - accidentially broken in 28831ed . 
X2 matrix needs 4 float elements . 
save watches per configuration type - fixed tests 
Committing a memory leak fix from Michael Koch - making sure that players are properly released after a call . 
Remove unused import in IndexedSetTest 
Fix for RajawaliRenderer . setCamera ( ) didn ' t update the 
Add back CordovaWebView . getUrl ( ) - needed by tests & does make sense to have 
rename method 
LPS - 37266 Source formatting - Just remove one empty line 
Also closes the executor containing the connections 
Automated g4 rollback of changelist 65602026 . 
optimized imports 
remove retina hint 
Fixed memory leak in ExtractEditLayout finish ( ) 
Add deprecated annotation to Util . getSize 
Remove unused assignment . 
IDEA - 103255 " Hide " toolwindow button stays " hover " after toolwindow restoring 
Instruction3rmi should use Format3rmi , not Format3rms 
Fix from post submit review 
fixed rare npe after race condition 
Fixed bug in class ReplayOutputChannelContext 
Fix incorrect hashcode implementation for AbstractType 
remove accidental System . out . println 
default constructor of Sprite didn ' t set the color . 
Fixed a minor issue in ParticleSystem . reset ( ) . 
Tag the EventPoller with comment to indicate its experimental status . 
FastArray doesn ' t overwrite toString ( ) method 
change caption to ' version control ' 
Removed dead code from sync unit test 
Recreate overlay view after the TIS crashes 
Fixed a bug where GCalControlSet might not be initialized correctly 
LPS - 54838 Remove Journal portlet key from portal 
Fixed problem with wrong log configuration . 
Fix a FindBugs warning 
Properly name ignored exception in ' catch ' block . 
Fix option parsing when piping data in via stdin 
Restore native synchronization functionality by loading proper module . 
Avoid NPE 
Fix Issue 1827 
Fix the issue of new call failing in 3 - way call scenario . 
remove useless ` deleteAllAccounts ` in ` initWpDb ` 
SONAR - 2279 Fix injection 
removed dead code 
Fixed no action button with resource string bug 
Fix name typo 
Fix build break in Bazaar history parsing 
Fix collapsible action views . 
Using version 0 . 4 . 0 
